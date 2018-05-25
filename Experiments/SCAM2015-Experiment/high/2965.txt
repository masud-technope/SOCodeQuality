import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Myclass {
    public static void main(String[] args) {

        try {

            ScriptEngineManager sem = new ScriptEngineManager();
            ScriptEngine se = sem.getEngineByName("JavaScript");
            String myExpression = "('abc' == 'xyz' && 'thy' == 'thy') || ('ujy' == 'ujy')";
            System.out.println(se.eval(myExpression));

        } catch (ScriptException e) {

            System.out.println("Invalid Expression");
            e.printStackTrace();

        }
    }
}