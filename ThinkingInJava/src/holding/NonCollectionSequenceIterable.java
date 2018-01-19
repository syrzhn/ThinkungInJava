package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import typeinfo.pets.Pet;

public class NonCollectionSequenceIterable 
	extends NonCollectionSequence implements Iterable<Pet> {

	public Iterable<Pet> reversed() {
		
		return new Iterable<Pet>() {
			
			public Iterator<Pet> iterator() {
				
				return new Iterator<Pet>() {
					int current = pets.length - 1;
					
					public boolean hasNext() { return current > -1; }
					
					public Pet next() { return pets[current--]; }
					
					public void remove() { // Not implemented
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	
	public Iterable<Pet> randomized() {
		return new Iterable<Pet>() {
			
			public Iterator<Pet> iterator() {
				List<Pet> shuffled =
						new ArrayList<Pet>(Arrays.asList(pets));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}
	
	public static void main(String[] args){
		NonCollectionSequenceIterable ncsi = new NonCollectionSequenceIterable();
		for (Pet pet : ncsi)
			System.out.print( pet + " ");
		System.out.println();
		for (Pet pet : ncsi.reversed())
			System.out.print( pet + " ");
		System.out.println();
		for (Pet pet : ncsi.randomized())
			System.out.print( pet + " ");
		System.out.println();
	}
}
