package metrics;

import identifier.semantics.IdentifierSemanticsProvider;
import java.io.File;
import java.io.FileWriter;
import compilerr.CompileErrManager;
import readability.ReadabilityProvider;
import sloc.SLOCProvider;
import utility.ContentLoader;
import config.StaticData;

public class OCMetricProvider {

	public OCMetricProvider()
	{
		//default constructor
	}
	
	protected void collectCodeMetrics() {
		// collecting compile error counts
		try {
			String codeFolder = StaticData.EXP_HOME + "/high";
			File outFile = new File(StaticData.EXP_HOME	+ "/metrics/high-metrics.txt");
			File dir = new File(codeFolder);
			if (dir.isDirectory()) {
				//metric collectors
				IdentifierSemanticsProvider semanticProvider=new IdentifierSemanticsProvider();
				CompileErrManager compErrProvider=new CompileErrManager();
				SLOCProvider slocProvider=new SLOCProvider();
				CycComplexityProvider cycProvider=new CycComplexityProvider();
				
				File[] codeFiles = dir.listFiles();
				FileWriter writer = new FileWriter(outFile);
				for (File f : codeFiles) {
					String code = ContentLoader.loadFileContentSC(f
							.getAbsolutePath());
					
					//now collect the metrics
					double readability=ReadabilityProvider.get_readability_score(code);
					double semantic=semanticProvider.getLowSemantics(code);
					double cerror=compErrProvider.getCompileErrCount(code);
					int sloc=slocProvider.getSLOC(f.getAbsolutePath());
					int ccomplexity=cycProvider.getCComplexity(code);
					int label=1;
					
					writer.write(readability+"\t"+semantic+"\t"+cerror+"\t"+sloc+"\t"+ccomplexity+"\t"+label+"\n");
				}
				writer.close();
				System.out.println("Metrics collected successfully!");
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OCMetricProvider().collectCodeMetrics();
	}
}
