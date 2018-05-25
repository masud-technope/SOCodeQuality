String[] ok = {"food","RocKet","man-in-the-middle","kahsdkjhsakdhakjsd","JESUS"};
String[] notOk = {"gipsy76", "www.google.com", "me@gmail.com", "745474","+-x/" };

Pattern p = Pattern.compile("[A-Za-z'-]+");

for (String shouldMatch : ok)
    if (!p.matcher(shouldMatch).matches())
        System.out.println("Error on: " + shouldMatch);

for (String shouldNotMatch : notOk)
    if (p.matcher(shouldNotMatch).matches())
        System.out.println("Error on: " + shouldNotMatch);