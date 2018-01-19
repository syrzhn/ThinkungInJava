package exceptions;

class ExceptionLevel1 extends Exception {}
class ExceptionLevel2 extends ExceptionLevel1 {}
class ExceptionLevel3 extends ExceptionLevel2 {}

class Level1{
	void f() throws ExceptionLevel1 {throw new ExceptionLevel1();}
}
class Level2 extends Level1{
	void f() throws ExceptionLevel2 {throw new ExceptionLevel2();}
}
class Level3 extends Level2 {
	void f() throws ExceptionLevel3 {throw new ExceptionLevel3();}
}

public class ThreeLevelsOfExceptions {
	public static void main(String[] args){
		Level1 l1 = new Level3();
		try {
			l1.f();
		} catch (ExceptionLevel3 e) {
			System.out.println("ExceptionLevel3 is caught");
			e.printStackTrace();
		}
		catch (ExceptionLevel2 e) {
			System.out.println("ExceptionLevel2 is caught");
			e.printStackTrace();
		}
		catch (ExceptionLevel1 e) {
			System.out.println("ExceptionLevel1 is caught");
			e.printStackTrace();
		}
	}
}/* Output:
ExceptionLevel3 is caught
exceptions.ExceptionLevel3
	at exceptions.Level3.f(ThreeLevelsOfExceptions.java:14)
	at exceptions.ThreeLevelsOfExceptions.main(ThreeLevelsOfExceptions.java:21)
*///:~