package ranks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import extractor.StaticData;

public class ExtremeResultAgreement {

	/**
	 * @param args
	 */
	
	public HashMap<Integer, String> vrankMap;
	public HashMap<Integer, Integer> postLabelDict;
	HashMap<Integer, String> crankMap;
	String qa5_3=StaticData.Data_Directory+"/max_min_id.txt";
	String cqa5_3=StaticData.Data_Directory+"/metdata/cr301.txt";
	

	public ExtremeResultAgreement()
	{
		 this.vrankMap=new HashMap<>();
		 populateHashMap(this.vrankMap, qa5_3);
		 this.crankMap=new HashMap<>();
		 populateHashMap(this.crankMap, cqa5_3);
		 //post class label dictionary
		 this.postLabelDict=new HashMap<>();
	}
	
	public ExtremeResultAgreement(String rankFile)
	{
		 this.vrankMap=new HashMap<>();
		 populateHashMap(this.vrankMap, qa5_3);
		 this.crankMap=new HashMap<>();
		 populateHashMap(this.crankMap, rankFile);
		 //post class label dictionary
		 this.postLabelDict=new HashMap<>();
	}
	
	
	public void loadPostLabels()
	{
		//code for loading post labels
		try
		{
			Scanner scanner=new Scanner(new File(qa5_3));
			while(scanner.hasNext()){
				String line=scanner.nextLine();
				String parts[]=line.split("\\s+");
				int questID=Integer.parseInt(parts[0]);
				int maxID=Integer.parseInt(parts[1].trim());
				int minID=Integer.parseInt(parts[2].trim());
				this.postLabelDict.put(maxID, 1);
				this.postLabelDict.put(minID, 0);	
			}
			scanner.close();
		}catch(Exception exc){
			
		}
	}
	
	
	protected void populateHashMap(HashMap<Integer, String> mymap, String fileName)
	{
		//code for populating the data to Hashmap
		File f=new File(fileName);
		try {
			Scanner scanner=new Scanner(f);
			while(scanner.hasNext()){
				String line=scanner.nextLine();
				String parts[]=line.split("\\s+");
				int questID=Integer.parseInt(parts[0]);
				mymap.put(questID, line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getResultAgreements()
	{
		int complete_agreement=0;
		int partial_agreement_max=0;
		int partial_agreement_min=0;
		int item_discarded=0;
		int completely_disagreed=0;
		String culprits=new String();
		String classified=new String();
		for(Integer key:this.vrankMap.keySet()){
			try
			{
			String vline=vrankMap.get(key);
			String cline=crankMap.get(key);
			String[] vparts=vline.split("\\s+");
			int vmaxID=Integer.parseInt(vparts[1].split(":")[0]);
			int vminID=Integer.parseInt(vparts[2].split(":")[0]);
			String[] cparts=cline.split("\\s+");
			int cmaxID=Integer.parseInt(cparts[1].split(":")[0]);
			int cminID=Integer.parseInt(cparts[2].split(":")[0]);
			
			if(vmaxID==vminID)
			{
				item_discarded++;
				continue;
			}
			
			if(vmaxID==cmaxID && vminID==cminID)
			{
				complete_agreement++;
				//System.out.print(key+" ");
				classified+=key+" ";
			}
			else if(vmaxID==cmaxID)partial_agreement_max++;
			else if(vminID==cminID)partial_agreement_min++;
			else 
			{
				completely_disagreed++;
				//System.out.print(key+" ");
				culprits+=key+" ";
			}
			//System.out.println("Completed:"+key);
			}catch(Exception e){
				e.printStackTrace();
				System.err.println(key);
			}
		}
		
		System.out.println("Complete agreement:"+complete_agreement);
		System.out.println("Partial agreement Max:"+partial_agreement_max);
		System.out.println("Partial agreement Min:"+partial_agreement_min);
		System.out.println("Items discarded:"+item_discarded);
		System.out.println("Complete disagreement:"+completely_disagreed);
		System.out.println("Culprints:\n"+culprits);
		System.out.println("Classified correctly:\n"+classified);
	}
	
	
	protected void get_kendall_tau_statistics()
	{
		//code for getting kendal tau statistics
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExtremeResultAgreement().getResultAgreements();

	}

}
