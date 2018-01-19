package holding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashSortMap {
	
	class ContainerSorted {
		private Map<Integer, String> container = new HashMap<Integer, String>();
		
		public void put(int key, String value) {
			container.put(key, value);
		}
		
		public String toString(){ return container.toString(); }
		
		public ContainerSorted() {
			put(7, "A");
			put(4, "b");
			put(3, "c");
			put(2, "A");
			put(0, "a");
		}
		
		public Set<Entry<Integer, String>> getSort() {
			return container.entrySet();
		}
		
		public String getValue(int key){
			return container.get(key);
		}
	}
	
	class ContainerNotSorted {
		Map<Integer, String> container = new LinkedHashMap<Integer, String>();
		
		public void put(int key, String value) {
			container.put(key, value);
		}
		
		public String toString() { return container.toString(); }
	}
	
	public static void main(String[] args){
		HashSortMap hsl = new HashSortMap();
		
		ContainerSorted cont1 = hsl.new ContainerSorted();
		System.out.println(cont1);
		
		Set<Entry<Integer, String>> set = new HashSet<Entry<Integer, String>>();
		set = cont1.getSort();
		System.out.println(set);
		
		ContainerNotSorted csort = hsl.new ContainerNotSorted();
		csort.container.put(2, cont1.getValue(2));
		csort.container.put(0, cont1.getValue(0));
		csort.container.put(4, cont1.getValue(4));
		System.out.println(csort);		
	}

}
