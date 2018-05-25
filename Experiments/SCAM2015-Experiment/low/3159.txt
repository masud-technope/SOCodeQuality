import javax.swing.*;
public class NonRepeat
{
    public static void main(String args[])
    {

        int login = Integer.parseInt(JOptionPane.showInputDialog("ASD"));
        while(login != 0)
        {
            int Array[] = new int [6];
            String output="";

            for(int index = 0; index<6; index++)
            {
                Array[index] = numGen(Array);


            }

            for(int index = 0; index<6; index++)
            {
                output += Array[index] + " ";
            }


            JOptionPane.showMessageDialog(null, output);

        }



    }

    public static int numGen(int Array[])
    {

        int random = (int)(1+Math.random()*6);

        for(int loop = 0; loop <Array.length ; loop++)
        {
            if(Array[loop] == random)
            {
                return numGen(Array);
            } 
        }


        return random;
    }
}