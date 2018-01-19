package holding;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSortSet {

	class ContainerSorted {
		private Set<String> container = new LinkedHashSet<String>();
		
		public void put(String value) {
			container.add(value);
		}
		
		public String toString(){ return container.toString(); }
		
		public ContainerSorted() {
			put("B");
			put("a");
			put("c");
			put("A");
			put("a");
		}
		
		public String getValue(String value){
			String retVal = null;
			if (container.contains(value)) {
				retVal = value;
			}
			return retVal;
		}
	}
	
	class ContainerNotSorted {
		Set<String> container = new HashSet<String>();
		
		public void put(String value) {
			container.add(value);
		}
		
		public String toString() { return container.toString(); }
	}
	
	public static void main(String[] args){
		HashSortSet hss = new HashSortSet();
		
		ContainerSorted contSort = hss.new ContainerSorted();
		System.out.println("sorted " + contSort);
		
		ContainerNotSorted cont = hss.new ContainerNotSorted();
		cont.put(contSort.getValue("B"));
		cont.put(contSort.getValue("a"));
		cont.put(contSort.getValue("c"));
		cont.put(contSort.getValue("A"));
		cont.put(contSort.getValue("a"));
		System.out.println("not sorted " + cont);		

		cont.container.clear();
		cont.put("B");
		cont.put("a");
		cont.put("c");
		cont.put("A");
		cont.put("a");
		System.out.println("not sorted " + cont);		
}

}
