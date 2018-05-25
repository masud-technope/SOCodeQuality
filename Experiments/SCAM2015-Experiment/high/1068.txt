FileOutputStream fos = new FileOutputStream("c:/myconfig.property");
Properties prop = new Properties();
prop.put("com.app.port", "8080");
prop.put("com.app.ip", "127.0.0.1");

prop.store(fos, "A Test to write properties");
fos.flush();

Properties prop2 = new Properties();
prop2.put("com.app.another", "Hello World");
prop2.store(fos, "Where does this go?");
fos.flush();

fos.close();