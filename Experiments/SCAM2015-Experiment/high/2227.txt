String filepath = "ICAREP_ANI_SVCPROF_20120614_001.DAT";
        String [] tempPath = filepath.split("_");
        System.out.println(""+tempPath[3]); //output = 20120614

        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        try
        {
            Date date1 = ft.parse(tempPath[3]); //covert the string into date
        }
        catch(ParseException ex)
        {
            System.out.println(""+ex);
        }

        //compare the date logic