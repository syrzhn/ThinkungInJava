package holding;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListLink {
	public static void main(String[] args){
		List<String> lst1 = new ArrayList<String>();
		lst1.add("0");
		lst1.add("1");
		lst1.add("2");
		lst1.add("3");
		lst1.add("4");
		System.out.println(lst1);
		
		ListIterator<String> it = lst1.listIterator();
		while (it.hasNext())
			System.out.print(it.next() + " index:" + it.nextIndex() + ", previous:" + it.previousIndex() + "; ");
		System.out.println();
	}
}