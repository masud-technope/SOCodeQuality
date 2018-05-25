package matrixConvertion;
import java.util.Arrays;

public class matrixConvertion {

        public static void main(String[] args)
            {

                int i,j=0;
                int count=10;
                int array2D[][]=new int[2][3];
                int array1D[]=new int[6];

                for(i=0;i<2;i++)
                {
                     for(j=0;j<3;j++)
                     {
                          array2D[i][j]=count;
                          count++;
                     }
                }

                for(i=0;i<2;i++)
                {
                     for(j=0;j<3;j++)
                     {
                          array1D[i+j+i*(array2D[0].length-1)] = array2D[i][j];                       
                     }
                }   
                System.out.println("1D array is:");
                System.out.println(Arrays.toString(array1D));


                Arrays.sort(array1D);
                System.out.println("sorted 1D array is:");
                System.out.println(Arrays.toString(array1D));
                int n=0, g=2;
                int[] reSorted=new int[array1D.length];
                for(int k=0; k<array1D.length; k++)
                {   
                      reSorted[k]=array1D[array1D.length-1-n];                    
                      n+=g;
                         if(n>=array1D.length)
                         {
                            n=array1D.length-1; g=-2; 
                         }
                }
                System.out.println("reSorted 1D array is:");
                System.out.println(Arrays.toString(reSorted));              


            }

}