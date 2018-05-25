import static Constants.PLANCK_CONSTANT;
import static Constants.PI;

public class Calculations {

    public double getReducedPlanckConstant() {
        return PLANCK_CONSTANT / (2 * PI);
    }
}