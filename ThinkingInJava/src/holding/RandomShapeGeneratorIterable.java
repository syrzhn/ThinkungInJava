package holding;

 
import java.util.Iterator;
import polymorphism.shape.RandomShapeGenerator;
import polymorphism.shape.Shape;

public class RandomShapeGeneratorIterable extends RandomShapeGenerator implements Iterable<Shape>{
	
	public Shape[] arrayOfShapes;
	
	public RandomShapeGeneratorIterable(int count){
		if (count <= 0)
			return;
		arrayOfShapes = new Shape[count];
		for (int i = 0; i < count; i++)
			arrayOfShapes[i] = next();
	}
	
	@Override
	public Iterator<Shape> iterator() {
		
		return new Iterator<Shape>() {
			
			private int index = 0;
			
			public boolean hasNext() {
				return index < arrayOfShapes.length;
			}
			
			public Shape next() { return arrayOfShapes[index++]; }
			
			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args){
		RandomShapeGeneratorIterable rsg = new RandomShapeGeneratorIterable(5);
		for (Shape shape : rsg){
			System.out.println( shape );
		}
	}
} ///:~
