package quizful.net;

public class RunManyMains {
	
    public static void main(String ... args) { 
        Boolean b = new Boolean("/true"); 
        System.out.println(b); 
    } 
 
    public static void main(String args) { 
        Boolean b = new Boolean("/false"); 
        System.out.println(b == false); 
    } 
}
