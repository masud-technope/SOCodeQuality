builder.setEntityResolver(new EntityResolver() {
        @Override
        public InputSource resolveEntity(String publicId, String systemId)
                throws SAXException, IOException {
            if (systemId.contains("foo.dtd")) {
                return new InputSource(new StringReader(""));
            } else {
                return null;
            }
        }
    });