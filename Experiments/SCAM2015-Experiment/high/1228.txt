SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmSS") {
  @Override
  public Date parse(String s) throws ParseException {
    return super.parse((s + "000000").substring(0, 14));
  }
};

System.out.println(sdf.format(sdf.parse("20110711182405")));
System.out.println(sdf.format(sdf.parse("201107111824")));
System.out.println(sdf.format(sdf.parse("20110711")));