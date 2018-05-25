DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
 DocumentBuilder builder = factory.newDocumentBuilder();
 Document configFileDoc = builder.parse(new ByteArrayInputStream(configFileStr.getBytes()));

 Configuration hibConfiguration = new Configuration();
 hibConfiguration.configure(configFileDoc);
 ArrayList<Document> hbmFileDocs = getHBMFileDocList(); //created the documents of the file string
 for(Document doc : hbmFileDocs)
        hibConfiguration.addDocument(doc);

 hibConfiguration.buildMappings();
 Class.forName("com.mysql.jdbc.Driver");
 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "username", "password");
 stmt = conn.createStatement();
 String sql = "CREATE DATABASE "+schemaName;
 stmt.executeUpdate(sql);
 SchemaExport schemaExport = new SchemaExport(hibConfiguration);
 schemaExport.create(true, true);