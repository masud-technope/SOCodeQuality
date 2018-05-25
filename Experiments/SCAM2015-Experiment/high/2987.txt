public static void main(String[] args) {

        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;

        for(int i=0; i<400000; i++){            
            int randno =  (int)(Math.random() * ((3) + 1));

            if(randno == 0){
                countZero++;
            }
            else if(randno == 1){
                countOne++;
            }
            else if(randno == 2){
                countTwo++;
            }
            else if(randno == 3){
                countThree++;
            }           
        }

        System.out.println("Zero: " + countZero);
        System.out.println("One: " + countOne);
        System.out.println("Two: " + countTwo);
        System.out.println("Three: " + countThree);


    }