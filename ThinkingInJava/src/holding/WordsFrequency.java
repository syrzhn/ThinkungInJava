package holding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.mindview.util.TextFile;

public class WordsFrequency {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>(new TextFile("C:\\Users\\Pinzhenin-SY\\JavaProjects\\TIJ\\ThinkingInJava\\src\\holding\\SetOperations.java", "\\W+"));
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		System.out.println(words);
		
		Map<String, Integer> wordsFreq = new LinkedHashMap<String, Integer>();
		for (String str : words) {
			Integer freq = wordsFreq.get(str);
			wordsFreq.put(str, freq == null ? 1 : ++freq);
		}
		System.out.println(wordsFreq);
	
	}
}
