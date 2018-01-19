package holding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mindview.util.TextFile;

public class VowelFrequency {

	public static void main(String[] args) {
		Map<String, Integer> vowel = new HashMap<String, Integer>();
		for (String key : "a,e,i,o,u,y,A,E,I,O,U,Y".split(","))
			vowel.put(key, 0);
		System.out.println(vowel);
		
		List<String> words = new ArrayList<String>(new TextFile("C:\\Users\\Pinzhenin-SY\\JavaProjects\\TIJ\\ThinkingInJava\\src\\holding\\SetOperations.java", "\\W+"));
		System.out.println(words);
		for (String str : words) {
			for (int i = 0; i < str.length(); i++) {
				String c = String.valueOf(str.charAt(i));
				if (vowel.containsKey(c)) {
					Integer freq = vowel.get(c);
					vowel.put(c, freq == 0 ? 1 : ++freq);
				}
			}
		}
		System.out.println(vowel);
	}
}
