package access;

//: access/SingleImport.java
import java.util.ArrayList;

public class SingleImport {
  public static void main(String[] args) {
    @SuppressWarnings({ "rawtypes", "unused" })
	ArrayList list = new java.util.ArrayList();
  }
} ///:~
