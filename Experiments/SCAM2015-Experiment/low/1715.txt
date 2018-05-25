import java.util.Scanner;

//begin class driver       
public class driver {

/**
 * @paramargs the command line arguments
 */
//begin main method
    public static void main(String[] args) {
    //initiates scanner
        Scanner userInput = new Scanner (System.in);

    //declare variables
    int dayOfWeek;
    String userEvent;

    //creates object for calender class
    calender calenderObject = new calender();
    calender.fillArray();

    //user prompt
    System.out.println("Enter day of week for your event in the following format:");
    System.out.println("Enter 1 for Monday");
    System.out.println("Enter 2 for Tuesday");
    System.out.println("Enter 3 for Wednsday");
    System.out.println("Enter 4 for Thursday");
    System.out.println("Enter 5 for Friday");
    System.out.println("Enter -1 to quit");

    //collect user input
    dayOfWeek = userInput.nextInt(); 

    //user prompt
    System.out.println("Please type in the name of your event");

    //collect user input
    userEvent = userInput.next();

    //begin while loop
    while (dayOfWeek != -1) {
        if ((dayOfWeek>=1) && (dayOfWeek<=5)){
            calenderObject.createEvent(dayOfWeek, userEvent,dayOfWeek);
            for (int i=0;i<calender.length;i++){
                System.out.println(calender.events[i]);
            }
            dayOfWeek = userInput.nextInt();

            if  (dayOfWeek == -1){
                for (int i=0;i<calender.length;i++){
                    System.out.println(calender.events[i]);
                }
                System.exit(0);
            }
            System.out.println("Please type in the name of your event");    
            userEvent = userInput.next();
        } else{
            System.out.println("You have entered an invalid number");
            System.out.println("Press -1 to quit or enter another day");
            System.out.println("Enter 1 for Monday");
            System.out.println("Enter 2 for Tuesday");
            System.out.println("Enter 3 for Wednsday");
            System.out.println("Enter 4 for Thursday");
            System.out.println("Enter 5 for Friday");
            System.out.println("Enter -1 to quit");
            dayOfWeek = userInput.nextInt(); 
        }
    }

    //end main method
}