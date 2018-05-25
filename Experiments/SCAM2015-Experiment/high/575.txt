FileReader fileReader = new FileReader(input);

    try {
        FileWriter fileWriter = new FileWriter(output);
        try {
            // may throw something
            sourceXmlToBeautifiedXml(fileReader, fileWriter);
        } finally {
            fileWriter.close();
        }
    } finally {
        fileReader.close();
    }