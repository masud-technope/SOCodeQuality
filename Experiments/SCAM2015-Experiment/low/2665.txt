package com.donemanuel.DSDK;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class LogKit {
 PrintWriter logd ;
void openLog() throws IOException{

Date ltm = new Date( );
SimpleDateFormat lt = new SimpleDateFormat ("'['dd.MM hh:mm:ss a']: '");
final String logtm = lt.format(ltm);
logd = new PrintWriter("res/LOGTIME_"+logtm, "UTF-8");

String prefix = "[Logger]:";

logd.println(prefix + "DSDK Logger opened!"); 

logd.println("----------xXx----------");
logd.flush();

}
void custommessage(String logmsg)  throws IOException{
logd.println(logmsg); //I want to print custom messages with my API, but log is declared in another void so thats the problem.
//If i would declare logd (printwriter) outside a void it would give me an error!
}
}