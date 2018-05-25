public class Questionaire{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String output;

        do{

            System.out.print("Do you love java? > ");
            output=sc.nextLine();

            if(output.equalsIgnoreCase("yes") || output.equalsIgnoreCase("no")){
                System.out.println("Thank you!");
            }
            else
            {
                System.out.println("Try again!");
            }

        }while(!output.equalsIgnoreCase("yes") && !output.equalsIgnoreCase("no"))

    }
}