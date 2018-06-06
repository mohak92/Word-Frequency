package solution;

public class WordFrequencies {
	
	public static int getFrequency(String[] book, String word) {
		word = word.trim().toLowerCase();
		int count = 0;
		for(String w : book) {
			if(w.trim().toLowerCase().equals(word))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] book = {"Once", "upon", "a", "time", "there", "was", "a", "boy", "who", "became", "a", "CEO", "he", "was", "brilliant", "he", "was", "best", "." };
		System.out.println(getFrequency(book, "he"));
	}

}
