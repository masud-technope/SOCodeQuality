package comments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import utility.ContentLoader;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;
import extractor.StaticData;

public class SentimentChecker {

	int postID;
	String sentences;
	final int SENTIMENT_THRESHOLD=2;
	
	public SentimentChecker(int postID)
	{
		this.postID=postID;
		this.loadSentences();
	}
	
	protected void loadSentences()
	{
		//loading the comments
		String fileName=StaticData.SOPostData+"/vcomments/"+postID+".txt";
		this.sentences=ContentLoader.loadFileContent(fileName);
	}
	
	protected void getSentiments()
	{
		//getting sentence sentiments
		Properties props = new Properties();
	    props.put("annotators", "tokenize, ssplit, parse, sentiment");
	    StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
	    Annotation annotation=pipeline.process(this.sentences);
	    int positive=0;
	    int negative=0;
	    for(CoreMap sentence:annotation.get(CoreAnnotations.SentencesAnnotation.class)){
	    	Tree tree=sentence.get(SentimentCoreAnnotations.AnnotatedTree.class);
	    	int sentiment = RNNCoreAnnotations.getPredictedClass(tree);
	    	System.out.println(sentiment);
	    	int sentimentValue=sentiment-SENTIMENT_THRESHOLD;
	    	if(sentimentValue<0){
	    		negative+=sentimentValue;
	    	}
	    	if(sentimentValue>0){
	    		positive+=sentimentValue;
	    	}
	    }
	    
	    int totalvalue=positive+(-1*negative);
	    
	    System.out.println("Positive sentiment:"+positive+" "+(double)positive/totalvalue);
	    System.out.println("Negative sentiment:"+negative+" "+(double)negative/totalvalue);
	    if(totalvalue>0)
	    saveCommentScore(postID, (double)positive/totalvalue, (double)negative/totalvalue);
	}
	
	protected void saveCommentScore(int postID, double positive, double negative)
	{
		//saving the comment scores
		String outFile=StaticData.SOPostData+"/vcommentscore.txt";
		File file=new File(outFile);
		try {
			FileWriter fwriter=new FileWriter(file,true);
			fwriter.write(postID+"\t"+positive+"\t"+negative+"\n");
			fwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){

		int postID=17922680;
		SentimentChecker checker=new SentimentChecker(postID);
		checker.getSentiments();
		
		
	}
}
