double[] values = {4, 77, 234, 4563, 13467, 635789};
    for(int i = 0; i < values.length; i++)
    {
        double tenthPower = Math.floor(Math.log10(values[i]));
        double place = Math.pow(10, tenthPower);
        System.out.println(place);
    }