try (
    FileReader fileReader = new FileReader(input); 
    FileWriter fileWriter = new FileWriter(output)
) {
    // may throw something
    sourceXmlToBeautifiedXml(fileReader, fileWriter);
}