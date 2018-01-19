package holding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.mindview.util.TextFile;

public class Vowel {
	
	public static void main(String[] args) {
		Set<String> vowel = new HashSet<String>();
		Collections.addAll(vowel, "a,e,i,o,u,y,A,E,I,O,U,Y".split(","));
		System.out.println(vowel);
		List<String> words = new ArrayList<String>(new TextFile("C:\\Users\\Pinzhenin-SY\\JavaProjects\\TIJ\\ThinkingInJava\\src\\holding\\SetOperations.java", "\\W+"));
		System.out.println(words);
		int q = 0;
		for (String str : words)
		{
			for (int i = 0; i < str.length(); i++)
			{
				String c = String.valueOf(str.charAt(i));
				if (vowel.contains(c))
					q++;
			}
		}
		System.out.println(q);
	}
}
