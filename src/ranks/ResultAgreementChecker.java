package ranks;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.commons.math3.stat.correlation.SpearmansCorrelation;
import extractor.StaticData;

public class ResultAgreementChecker {

	/**
	 * @param args
	 */

	protected double get_spearman_correlation(double[] list1, double[] list2) {
		// code for getting correlation
		SpearmansCorrelation corr = new SpearmansCorrelation();
		return corr.correlation(list1, list2);
	}

	protected void get_result_correlation() {
		// code for getting correlation between results
		String folder = StaticData.Data_Directory + "/mranks";
		File f = new File(folder);
		if (f.isDirectory()) {
			File[] files = f.listFiles();
			int significant_correlation = 0;
			int positive_corrleation=0;
			int negative_correlation=0;
			int not_related=0;
			for (File f2 : files) {
				ArrayList<Double> item1 = new ArrayList<>();
				ArrayList<Double> item2 = new ArrayList<>();
				try {
					Scanner scanner = new Scanner(f2);
					String _line1 = scanner.nextLine();
					String _line2 = scanner.nextLine();
					String[] line1 = _line1.split("\\s+");
					String[] line2 = _line2.split("\\s+");
					for (int i = 0; i < line1.length; i++) {
						item1.add(Double.parseDouble(line1[i]));
						item2.add(Double.parseDouble(line2[i]));
					}

					if (item1.size() >= 2) {
						double[] arr1 = new double[item1.size()];
						double[] arr2 = new double[item2.size()];
						for (int i = 0; i < arr1.length; i++) {
							// capturing the primitive values
							arr1[i] = item1.get(i).doubleValue();
							arr2[i] = item2.get(i).doubleValue();
						}
						double correlation = get_spearman_correlation(arr1,
								arr2);
						System.out.println(f2.getName() + " Correlation:"
								+ correlation);
						if (correlation > .80 || correlation<-.80)
							significant_correlation++;
						if(correlation>0)positive_corrleation++;
						else if(correlation<0)negative_correlation++;
						else not_related++;
					}

				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("Significant correlation:"+significant_correlation);
			System.out.println("Positive correlation:"+positive_corrleation);
			System.out.println("Negative correlation:"+negative_correlation);
			System.out.println("No correlation:"+not_related);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ResultAgreementChecker().get_result_correlation();
	}

}
