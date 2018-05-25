String dob="02/27/2013";
    Date today = new Date();

    try {
        Date dobDate = new SimpleDateFormat("MM/dd/yyyy").parse(dob);

        if (dobDate.compareTo(today) <= 0) {
            //before or equals today
            System.out.println("before");
        }
    } catch (ParseException e) {
        //handle exception
    }