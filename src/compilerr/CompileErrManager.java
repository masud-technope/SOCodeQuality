package compilerr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import config.StaticData;
import utility.ContentLoader;

public class CompileErrManager {

	String code;
	double cErrCount = 0;

	public CompileErrManager(String code) {
		this.code = code;
	}
	
	public CompileErrManager(){
		//default constructor
	}
	
	protected int getErrCount(String outFile) {
		// getting error count
		int errCount = 0;
		String[] lines = ContentLoader.getAllLines(outFile);
		if (lines.length > 0) {
			String lastLine = lines[lines.length - 1];
			if (lastLine.contains("error")) {
				errCount = Integer.parseInt(lastLine.trim().split("\\s+")[0]);
			}
		}
		return errCount;
	}

	public double getCompileErrCount(String code) {
		// collecting compilation error count
		try {
			saveCodeTemporarily(code);
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			String outFile = "./output/out.txt";
			String classFile="./code/Code.java";
			OutputStream out = new FileOutputStream(new File(outFile));
			int result = compiler.run(null, null, out, classFile);
			if (result > 0) {
				this.cErrCount = getErrCount(outFile);
				int sloc=ContentLoader.getAllLines(classFile).length;
				this.cErrCount=(double)this.cErrCount/sloc;
			} else
				return 0;
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		// returning error count
		return this.cErrCount;
	}

	protected void saveCodeTemporarily(String code) {
		// saving code temporarily to a Java file
		try {
			String classCode =code;//  "class A { " + code + " }";
			FileWriter writer = new FileWriter(new File("./code/Code.java"));
			writer.write(classCode);
			writer.close();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	protected void collectCompileErrors() {
		// collecting compile error counts
		try {
			String codeFolder = StaticData.EXP_HOME + "/high";
			File outFile = new File(StaticData.EXP_HOME	+ "/metrics/high-errors.txt");
			File dir = new File(codeFolder);
			if (dir.isDirectory()) {
				File[] codeFiles = dir.listFiles();
				FileWriter writer = new FileWriter(outFile);
				for (File f : codeFiles) {
					String code = ContentLoader.loadFileContentSC(f
							.getAbsolutePath());
					//saveCodeTemporarily(code);
					double errCount=getCompileErrCount(code);
					writer.write(errCount+"\n");
					System.out.println(errCount);
				}
				writer.close();
				System.out.println("Compile error counts saved successfully!");
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CompileErrManager().collectCompileErrors();
	}
}
