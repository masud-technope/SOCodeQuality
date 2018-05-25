import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;
import java.util.Timer;
import java.util.TimerTask;

public class DateServer extends Thread {
    public static void main(String args[]) {
        new Runner().go();
    }
}

class Runner {
    public static  LinkedList<String> data = new LinkedList<String>();

    public void go() {
        ServerSocket echoServer = null;

        MyTimerTask timerTask = new MyTimerTask();
        new Timer().scheduleAtFixedRate(timerTask, 0, 2000);

        try {
            echoServer = new ServerSocket(3000);
        }
        catch (IOException e) {
            System.out.println(e);
        }

        try {
            Socket clientSocket = echoServer.accept();
            DataInputStream is = new DataInputStream(clientSocket.getInputStream());
            PrintStream os = new PrintStream(clientSocket.getOutputStream());

            while (true) {
                String line = is.readLine();
                data.add(line);
                os.println("From server: "+ line);
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

class MyTimerTask extends TimerTask {
    public void run() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd-hhmm");
        String line = null;
        System.out.print(".");
        try {
            String str = format.format(new Date());
            FileWriter fstream = new FileWriter("C://" +str+".txt",true);
            BufferedWriter out = new BufferedWriter(fstream);
            while (Runner.data.size() > 0) out.write(Runner.data.getLast());
            out.newLine();
            out.flush();
            out.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage() + e.getStackTrace()[0].toString());
        }
    }
}