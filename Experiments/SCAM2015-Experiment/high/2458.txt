String[] str = {"PTE", "LTD", "PRIVATE", "LIMITED"};
String company = "PTE      Basit PTE";
for(int i=0;i<str.length;i++) {
    company = company.replaceAll(str[i], "");
}
System.out.println(company.replaceAll("\\s","")); //remove whitespaces