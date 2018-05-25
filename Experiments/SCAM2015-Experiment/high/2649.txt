ByteArrayOutputStream bos = new ByteArrayOutputStream();
xlsFile.write(bos); // write excel data to a byte array
fos.close();

// Now use your ByteArrayDataSource as
DataSource fds = new ByteArrayDataSource(bos.toByteArray(), "application/vnd.ms-excel");