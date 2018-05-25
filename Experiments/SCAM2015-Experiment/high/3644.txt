String[] data = {
        "ABC_1234_XL.jpg",
        "XYZ_7890_SM.jpg",
        "PQ_R_4567_LG.jpg",
};
Pattern p = Pattern.compile(
            "([a-z]+(?:_[a-z]+)*)_(\\d+)_([a-z]+)[.]jpg",
   //group 1  ^^^^^^^^^^^^^^^^^^
   //group 2                       ^^^^
   //group 3                              ^^^^^^
            Pattern.CASE_INSENSITIVE);
for (String s : data) {
    Matcher m = p.matcher(s);
    if (m.matches())
        System.out.println(m.group(1)+" : "+m.group(2)+" : "+m.group(3));
    else
        System.out.println(s+" doesn't match pattern");
}