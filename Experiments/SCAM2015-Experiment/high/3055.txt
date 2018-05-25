Map<Integer,Integer[][]> mainMap = new HashMap<Integer,Integer[][]>();
Integer[][] row1 = new Integer[1][2];//first base and power
row1[0][0] = 1;
row1[0][1] = 1;
Integer[][] row2 = new Integer[1][2];//second base and power
row2[0][0] = 2;
row2[0][1] = 5;

mainMap.put(1,row1);
mainMap.put(25,row2);