String[] tests = {
        "NAME*ADRESS LINE1*ADDRESS LINE2*",
        "NAME*ADRESS LINE1**",
        "NAME**ADDRESS LINE2*",
        "NAME***",
        "*ADDRESS LINE1*ADDRESS LINE2*",
        "*ADDRESS LINE1**",
        "**ADDRESS LINE2*",
        "***",
        "-MS DEBBIE GREEN*1036 PINEWOOD CRES**",
    };
    for (String test : tests) {
        test = test.substring(0, test.length() - 1);
        String[] parts = test.split("\\*", 3);
        System.out.printf(
            "%s%n  Name: %s%n  Address Line1: %s%n  Address Line2: %s%n%n",
            test, parts[0], parts[1], parts[2]
        );
    }