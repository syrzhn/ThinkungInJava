package holding;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class LinkedHashMapSort {

	public static void main(String[] args) {
		Map<String, String> map1 = new LinkedHashMap<String, String>();
		map1.put("aaa", "aaa");
		map1.put("bbb", "bbb");
		map1.put("nnn", "nnn");
		map1.put("eee", "eee");
		map1.put("ccc", "ccc");
		map1.put("ddd", "ddd");
		System.out.println(map1);
		
		SortedSet<String> set = new TreeSet<String>();
		set.addAll(map1.keySet());
		System.out.println(set);
		Iterator<String> it = set.iterator();
		while (it.hasNext()){
			String s = it.next();
			map1.remove(s);
			map1.put(s, s);
		}
		System.out.println(map1);
	}
}
