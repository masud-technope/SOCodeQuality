double threshold = 0;
           for(int i = 0; i < pixels.length; i++)
           {
               for(int j=0;j<pixels[i].length;j++){
                   threshold += (double)pixels[i][j];
               }
           }
           System.out.print(threshold);