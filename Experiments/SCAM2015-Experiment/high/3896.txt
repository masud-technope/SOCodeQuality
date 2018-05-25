public static void main(String[] args) {
        int size = 7;
        boolean add = true;
        int counter = 0;
        Random randomNumber = new Random();
        int randomArray[] = new int[size];
        for(int j = 0; j < size; j++)
        {
            randomArray[j] = -1;
        }
        while (counter < size) {
            add = true;
            int randomValue = randomNumber.nextInt(7);
            for (int x = 0; x < size; x++) {
                if (randomValue == randomArray[x]) {
                    add = false;
                }
            }// End for-loop
            if(add)
            {
                randomArray[counter] = randomValue;
                counter++;
            }
        }

        for (int y = 0; y < size; y++) {
            System.out.println(randomArray[y]);
        }
    }