//begin calender class
public class calender {

    static int length = 5;
    static String[] events = new String[length];

    public static String[] fillArray(){
        for (int i=0; i< length;i++){
            events[i] = "-No event planned-";
        }
        return events;
    }

    //begin createEvent method
public String[] createEvent(int l, String userEvent, int dayOfWeek){
    int t = l;
        if(t%5 == 1 ){
            events[0] = ("Monday Appoinment: ") + userEvent;
        } else if(t%5 == 2 ){
            events[1] = ("Tuesday Appoinment: ") + userEvent;
        } else if(t%5 == 3 ){
            events[2] = ("WednsdayAppoinment: ") + userEvent;
        } else if(t%5 == 4){
            events[3] = ("Thursday Appoinment: ") + userEvent;
        } else if(t%5 == 0 ){
            events[4] = ("Friday Appoinment: ") + userEvent;
        }        
        return events;
    }

//end calender class    
}