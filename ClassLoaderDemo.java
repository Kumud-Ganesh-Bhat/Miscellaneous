/**
* <h1> Java Program demonstrating the use of Classloader </h1>
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class ClassLoaderDemo{
  public static void main(String[] args){
    //String class is loaded from bootstrap class loader and it is not java object. 
    //Hence it returns null
    System.out.println(String.class.getClassLoader());
    //ClassLoaderDemo class is loaded from Application classloader
    System.out.println(ClassLoaderDemo.class.getClassLoader());
  }
}
