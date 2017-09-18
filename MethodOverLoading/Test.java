/**
* <h1> Java program to demonstrate that main method can be overloaded </h1>
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class Test{
  
      public static void main(String[] args){
             System.out.println("Default main method configured in JVM");
             Test.main("Hello", "World");
      }
  
      public static void main(String arg1, String arg2){
              System.out.println(arg1 + " " + arg2);
              Test.main("Geeks", "for", "Geeks");
      }
  
      public static void main(String arg1, String arg2, String arg3){
             System.out.println(arg1 + " " + arg2 + " " + arg3);
      }
}
