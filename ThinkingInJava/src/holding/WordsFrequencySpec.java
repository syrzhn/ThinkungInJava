package holding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.mindview.util.TextFile;

public class WordsFrequencySpec {
	
	public static void main(String[] args) {

		class WordsFrequency{
			String word = "";
			int    freq =  0;
			
			WordsFrequency(String str){
				if (! str.isEmpty()) {
					word = str;
					freq =   1;
				}
			}

			@Override
			public	boolean equals(Object o) {
				boolean eq = ((WordsFrequency) o).word.equals(this.word);
				if (eq) 
					++freq;
				return eq;
			}
			@Override
			public	String toString() {
				return word + "~" + freq;
			}
		}

		List<String> words = new ArrayList<String>(new TextFile("C:\\Users\\Pinzhenin-SY\\JavaProjects\\TIJ\\ThinkingInJava\\src\\holding\\SetOperations.java", "\\W+"));
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		System.out.println(words);
		
		Set<WordsFrequency> word_freq = new HashSet<WordsFrequency>();
		for (String str : words) {
			WordsFrequency wc = new WordsFrequency(str);
			if (word_freq.contains(wc)) {
				++wc.freq;
			}
			word_freq.add(wc);
		}
		System.out.println(word_freq);
	}
}