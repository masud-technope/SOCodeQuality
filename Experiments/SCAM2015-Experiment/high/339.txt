SAXParserFactory spf = SAXParserFactory.newInstance();
SAXParser sp = spf.newSAXParser();
XMLReader xmlr = sp.getXMLReader();
xmlr.setEntityResolver(new EntityResolver() {
    public InputSource resolveEntity(String pid, String sid) throws SAXException {
        if (sid.equals("your remote dtd url here"))
            return new InputSource(new StringReader("actual contents of remote dtd"));
        throw new SAXException("unable to resolve remote entity, sid = " + sid);
    } } );
SAXSource ss = new SAXSource(xmlr, myInputSource);