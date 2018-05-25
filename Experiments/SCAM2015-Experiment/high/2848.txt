String no1="00669253";
String no2="87654321";
int sum=0;
for(int i=0;i<no1.length();i++){
        sum+=Integer.parseInt(""+no1.charAt(i))*Integer.parseInt(""+no2.charAt(i));
}