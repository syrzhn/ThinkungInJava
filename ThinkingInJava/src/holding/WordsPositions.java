package holding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import net.mindview.util.TextFile;

public class WordsPositions {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>(new TextFile("C:\\Users\\Pinzhenin-SY\\JavaProjects\\TIJ\\ThinkingInJava\\src\\holding\\SetOperations.java", "\\W+"));
		System.out.println(words);
		
		Map<String, ArrayList<Integer>> wordsPos = new HashMap<String, ArrayList<Integer>>();
		int i = 0; 
		for (String str : words) {
			if (wordsPos.containsKey(str)) {
				wordsPos.get(str).add(i);
			}
			else {
				ArrayList<Integer> poses = new ArrayList<Integer>();
				poses.add(i);
				wordsPos.put(str, poses);
			}
			i++;
		}
		System.out.println(wordsPos);
		i = 0;
		Map<Integer, String> wordsOrder = new TreeMap<Integer, String>();
		Set<String> it = wordsPos.keySet();
		for (String str : it){
			ArrayList<Integer> its = wordsPos.get(str);
			for(Integer in : its)
				wordsOrder.put(in, str);
		}
		System.out.println(wordsOrder);
	}
}
