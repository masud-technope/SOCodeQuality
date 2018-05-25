int[][] intcoordinates = new int[3][4]; // init the array, the row and the col can be figured.
    for(int i=0; i<coordinates.length; i++)
    {
        //System.out.println(coordinates[i]);
        rect = coordinates[i].split(",");
        for(int j=0; j<rect.length; j++)
        {
            intcoordinates[i][j] = Integer.parseInt(rect[j]);
        }

    }
    System.out.println(Arrays.deepToString(intcoordinates));