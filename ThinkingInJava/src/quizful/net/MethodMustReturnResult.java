package quizful.net;

public class MethodMustReturnResult {
	public static double sqr0(double arg) { 
        throw new RuntimeException(); 
    }
	
	public static double sqr1(double arg) { 
        while (true); 
    }
}