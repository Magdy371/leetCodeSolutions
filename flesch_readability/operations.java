public class operations extends abstract_operations
{
	public String[] words;
	@Override
	public int getNumOfWords(String text){
		String[] splited_words = text.split("\\s+");
		return splited_words.length;
	}
	
	@Override
	public int getNumOfSentences(String text)
	{
		String[] splited_sentences = text.split("[.!?]+");
		return splited_sentences.length;
	}
	
	@Override
	public void getSplited_words(String text)
	{
		int i, j =0;
		String[] splited_words = text.split("\\s+");
		words = splited_words;
	}
	
	@Override
	public int getNumOfSyllables(String text)
	{
		String[] tokens = text.split("[aeiouyAEIOUY]+");
		String[] loneEs = text.split("[^aeiouyAEIOUY]+[eE]\\b");
		String[] singleEs = text.split("\\b[^aeiouyAEIOUY]*[eE]\\b");
		return tokens.length - loneEs.length - singleEs.length;
	}
}