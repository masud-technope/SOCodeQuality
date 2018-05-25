long timeInMillis = System.currentTimeMillis();
Calendar cal1 = Calendar.getInstance();
cal1.setTimeInMillis(timeInMillis);
SimpleDateFormat dateFormat = new SimpleDateFormat(
                                "dd/MM/yyyy hh:mm:ss a");
dateforrow = dateFormat.format(cal1.getTime());