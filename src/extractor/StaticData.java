package extractor;
public class StaticData {

	//require constants for database access
	public static String Database_name="stackoverflow_db";
	//public static String connectionString="jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName="+Database_name+";integratedSecurity=true";
	public static String connectionString="jdbc:sqlserver://localhost:1433;databaseName="+Database_name+";integratedSecurity=true";
	
	public static String Driver_name="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static String Badges_file_name="E:\\My MSc\\CMPT 846\\Research Project\\Dataset\\012011 Stack Overflow\\badges1.xml";
	public static String Comments_file_name="E:\\My MSc\\CMPT 846\\Research Project\\Dataset\\012011 Stack Overflow\\comments1.xml";
	public static String Posts_file_name="E:\\My MSc\\CMPT 846\\Research Project\\Dataset\\012011 Stack Overflow\\posts1.xml";
	public static String Votes_file_name="E:\\My MSc\\CMPT 846\\Research Project\\Dataset\\012011 Stack Overflow\\votes1.xml";
	public static String Users_file_name="E:\\My MSc\\CMPT 846\\Research Project\\Dataset\\012011 Stack Overflow\\users1.xml";
	public static String PostHistory_file_name="E:\\My MSc\\CMPT 846\\Research Project\\Dataset\\012011 Stack Overflow\\posthistory1.xml";
    //code fragment directory
	public static String Fragment_Dir="C:\\MyWorks\\Dataset\\SOPost\\frags";
    //code fragment info
	public static String Fragment_Info="C:\\MyWorks\\Dataset\\SOPost\\info";
	public static String Data_Directory="C:/MyWorks/Dataset/SOPost/qstans";
	//public static String Data_Directory="D:/My MSc/MyDataset/SO Data";
	
	public static String SOPostData="C:/MyWorks/Thesis Works/Crowdsource_Knowledge_Base/ICSE2015Data";
	
	
	
}
