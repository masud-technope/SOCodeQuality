package metrics;

public class LogisticRegresser {

	/**
	 * @param args
	 */
	static double readability_coeff=1.1001;// .9673;// 1.085; //0.3936;
	static double author_expert_coeff= -3.0922;//-7.5155;// -16.9243;// 5.5268;
	static double soundness_coeff= 0.4726;
	static double strength_coeff=2.0855;//-3.3309;// 1.8001;
	static double weakness_coeff=-.6776;//-.5934;// 0.1167;
	static double sonar_coeff= -1.8666;//-.4305;// -0.6995;// 0.6538;
	static double intercept=.1304;// .0551;// -.5848;//0.1923;
	
	public static double getOddsRatio(double R, double A, double CS, double RV)
	{
		double z=intercept+R*readability_coeff+A*author_expert_coeff+CS*soundness_coeff+RV*sonar_coeff;
		z*=-1;
		double oddRatio=1/(1+Math.exp(z));
		return oddRatio;
	}
	public static double getOddsRatio(double R, double A, double S, double W, double RV)
	{
		double z=intercept+R*readability_coeff+A*author_expert_coeff+S*strength_coeff+
				W*weakness_coeff+RV*sonar_coeff;
		z*=-1;
		double oddRatio=1/(1+Math.exp(z));
		return oddRatio;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
