for(int f = 0; f < moves.size(); f++)//make a copy of original array.
 {
    List<List<String>> mid_array = new ArrayList<List<String>>();
    List<String> row_st = moves.get(f).get(0);
    List<String> deck_st = moves.get(f).get(1);

    mid_array.add(row_st);//current array of the Rows
    mid_array.add(deck_st);//current array of the Deck

    moves1.add(mid_array);

    System.out.println("Moves1 "+moves1);//displays the new array correctly

    //No need to clear as in each iteration, it will instantiate a new mid_array
 }