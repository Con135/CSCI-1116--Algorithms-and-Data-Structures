
class WordOccurrence implements Comparable<WordOccurrence> {
	String word;
	int count;
	
	public WordOccurrence(String word, int count) {
		this.word = word;
		this.count = count;
	}
	
	@Override
	public int compareTo(WordOccurrence o) {
		if (this.count > o.count) {
			return 1;
		}
		else if (this.count < o.count) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
}