package typeinfo;

import java.lang.reflect.Method;

class IsoscelesTriangle extends Triangle{
	public IsoscelesTriangle(){};
}

public class Practice8 {
	static void getParents (Class<?> cls) {
		if (cls == null) return;
		
		String s = cls.getName() + " methods: ";
		for (Method m : cls.getDeclaredMethods()) {
			s+= m.getName() + " ";
		}
		s = s.substring(0, s.length() - 1);
		s += "\n";
		System.out.print(s);

		cls = cls.getSuperclass();
		
		getParents(cls);
	}
	
	public static void main(String args[]){
		Shape s = new IsoscelesTriangle();
		getParents(s.getClass());
	}
}
