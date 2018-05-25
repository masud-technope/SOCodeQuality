try {
    row.createCell(0).setCellValue(Long.parseLong(aNumericOnlyPhoneNumberString));
} catch (NumberFormatException e) {
    row.createCell(0);
}
CellStyle phoneNumberStyle = wb.createCellStyle();
phoneNumberStyle.setDataFormat(wb.createDataFormat().getFormat("(000) 000-0000"));
row.getCell(0).setCellStyle(phoneNumberStyle);