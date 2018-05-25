import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class test2 {

    public static void main(String[] args) {

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello");
            }
        });

        timer.start();
        }

        while (true) /* no operation */;
    }
}