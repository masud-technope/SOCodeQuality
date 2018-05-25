for (Map.Entry<Integer, Integer[][]> entry : mainMap.entrySet()) {
        System.out.println("Base= " + entry.getKey() 
            + ", Power= " + entry.getValue()[0][0]
            + ", BaseToPower= " + entry.getValue()[0][1]);

}
//mainMap.get(25); will return base and power array