double timezoneval = 0.0;
        Calendar cal = Calendar.getInstance();
        cal.set(mn.Year(), mn.Month(), mn.Day(), mn.Hour(), mn.minute(),
                (int) mn.second());
        TimeZone tz = TimeZone.getDefault();
        boolean t = tz.inDaylightTime(cal.getTime());
        if (t)
            timezoneval = ((TimeZone.getDefault().getRawOffset())
                    / (60 * 60 * 1000D) + (TimeZone.getDefault()
                    .getDSTSavings() / (60 * 60 * 1000D)));
        else
            timezoneval = ((TimeZone.getDefault().getRawOffset()) / (60 * 60 * 1000D));