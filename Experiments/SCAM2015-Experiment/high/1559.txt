boolean shareClass = false;
for (Statement s: instance1.listProperties(RDF.type)) {
    if (instance2.hasProperty(RDF.type, s.getObject()) {
        shareClass = true;
        break;
    }
}