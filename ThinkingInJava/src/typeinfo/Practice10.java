package typeinfo;

public class Practice10 {
	static void isAnObject(Object c) {
		System.out.println(c.getClass().getName() + " superclass: " + c.getClass().getSuperclass().getName());
	}
	static void isAnObject(Object[] c) {
		System.out.println(c.getClass().getName() + " superclass: " + c.getClass().getSuperclass().getName());
	}
	public static void main(String args[]){
		isAnObject('c');
		isAnObject("c");
		isAnObject(10);
		isAnObject(new char[3]);
		isAnObject(char.class);
	}
}
