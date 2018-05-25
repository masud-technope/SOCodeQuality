DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factory.newDocumentBuilder();
Document doc = builder.parse("<Your xml doc uri>");
XPathFactory xPathfactory = XPathFactory.newInstance();
XPath xpath = xPathfactory.newXPath();
XPathExpression expr = xpath.compile("//Type[@type_id=\"4218\"]");
NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);