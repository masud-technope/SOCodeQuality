String TIME_SERVER = "time-a.nist.gov";   
NTPUDPClient timeClient = new NTPUDPClient();
InetAddress inetAddress = InetAddress.getByName(TIME_SERVER);
TimeInfo timeInfo = timeClient.getTime(inetAddress);
long returnTime = timeInfo.getMessage().getTransmitTimeStamp().getTime();
Date time = new Date(returnTime);