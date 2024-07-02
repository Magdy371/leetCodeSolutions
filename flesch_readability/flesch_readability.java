public class flesch_readability
{
	public static void main(String[] args)
	{
		String text = new String("hello my name is magdy. graduated from FCI department of cs. I have done certifications in Data analysis and java prgramming.");
		System.out.println("hello world");
		operations obj = new operations();
		int nos = obj.getNumOfSentences(text);
		int now = obj.getNumOfWords(text);
		int nosy = obj.getNumOfSyllables(text);	
		System.out.println("number of sentences in the document is: " + nos );
		System.out.println("number of words in the document is: " + now );
		System.out.println("number of syllables in the document is: " + nosy );
		
		double flesch_readability = 206.835-1.015*(now/nos)-84.6*(nosy/now);
		System.out.print("Flesch Readability Score is: " + flesch_readability );
	}
}