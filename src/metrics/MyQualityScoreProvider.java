package metrics;

public class MyQualityScoreProvider {
	
	static double readability_weight=3.0043;// 2.6309;// 1.085; //0.3936;
	static double author_expert_weight=.0454;// .0034;//.0005;// -16.9243;// 5.5268;
	static double soundness_weight=3.0118;// 0.4726;
	static double strength_weight=8.0484;// 27.9646;//1.8001;
	static double weakness_weight=0.5078;// 0.5831;// 0.1167;
	static double sonar_violation_weight=0; //0.1547;// 0.6596;// 0.6502;//-0.6995;// 0.6538;
	
	public static double getEstimatedQualityWeight(double R, double A, double S, double W, double RV)
	{
		double total_score=R*readability_weight+A*author_expert_weight+S*strength_weight+W*weakness_weight+RV*sonar_violation_weight;
		return total_score;
	}
	
	public static double getEstimatedQualityWeight(double R, double A, double CS, double RV)
	{
		double total_score=R*readability_weight+A*author_expert_weight+CS*soundness_weight+RV*sonar_violation_weight;
		return total_score;
	}
}
