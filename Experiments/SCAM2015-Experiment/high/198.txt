<cfscript>
machineName = createObject("java", "java.net.InetAddress").localhost.getCanonicalHostName();
hostaddress = createObject("java", "java.net.InetAddress").localhost.getHostAddress();
</cfscript>
<cfdump var="#machineName#"><br />
<cfdump var="#hostaddress#"><br />