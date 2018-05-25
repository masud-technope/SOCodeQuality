Workbook xlsFile = new HSSFWorkbook(); // create a workbook
CreationHelper helper = xlsFile.getCreationHelper();
Sheet sheet1 = xlsFile.createSheet("Sheet #1"); // add a sheet to your workbook

while(rs.next())
{
 Row row = sheet1.createRow((short)0); // create a new row in your sheet
 for(int i = 0; i < 12; i++)
 {
   row.createCell(i).setCellValue(
     helper.createRichTextString(exceldata)); // add cells to the row
 }
} 

// Write the output to a temporary excel file
FileOutputStream fos = new FileOutputStream("temp.xls");
xlsFile.write(fos);
fos.close();

// Switch to using a `FileDataSource` (instead of ByteArrayDataSource)
DataSource fds = new FileDataSource("temp.xls");