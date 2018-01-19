package exceptions;

class ExceptionFail1 extends Exception{ private static final long serialVersionUID = 1L; };

public class FailingConstructor1 {
	
	public FailingConstructor1(){
		System.out.println("Constructor FailingConstructor1");
	}
	
	class Fail1 {
		public Fail1() throws ExceptionFail1
		{
			System.out.println("Constructor Fail1");
			throw new ExceptionFail1();
		}
	}

	class Fail2 extends Fail1 {

		public Fail2() throws ExceptionFail1 {
			super();
			System.out.println("Constructor Fail2");
		}
		
	}
	
	public static void main(String[] args) {
		FailingConstructor1 fc = new FailingConstructor1();
		try {
			Fail2 f2 = fc.new Fail2();
		} catch (ExceptionFail1 e) {
			e.printStackTrace();
		}
		
		try {
			Fail1 f1 = fc.new Fail1();
		} catch (ExceptionFail1 e) {
			e.printStackTrace();
		}
	}
}
