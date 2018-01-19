package holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class MoviesActorsLists {
	private int i = 0;
	private Map<String, Collection<String>> movies = new HashMap<String, Collection<String>>();
	public void add(String args[]) {
		Collection<String> actors = new ArrayList<String>();
		String a[] = new String[args.length-1];
		for (int i = 0; i < args.length - 1; i++)
			a[i] = args[i + 1];
		Collections.addAll(actors, a);
		movies.put(args[0], actors);
		hasNext = true;
	}
	
	public String next() {
		Set<String> keys = movies.keySet();
		int len = keys.size();
		Iterator<String> it = keys.iterator();
		for (int j = 0; j < len; j++) {
			hasNext = it.hasNext();
			String key  = it.next();
			Collection<String> acts = movies.get(key);
			if (j == i) {
				System.out.println(key + "  " + acts.toString());
				i++;
				return acts.toString();
			}
		}
		return null;
	}
	public boolean hasNext;
	public String toString(){
		return movies.toString();
	}
}

public class GenericActorsLists {
	public static void main(String[] args){
		MoviesActorsLists movs = new MoviesActorsLists();
		String[] a = {"asd", "1", "2", "3"};
		movs.add(a);
		String[] b = {"qwerty", "1", "2", "3", "4", "5", "6"};
		movs.add(b);
		String[] c = {"zxcv", "aaa", "bbb", "c", "dd", "e"};
		movs.add(c);
		System.out.println(movs);
		while (movs.hasNext) {
			movs.next();
		};
	}
}
