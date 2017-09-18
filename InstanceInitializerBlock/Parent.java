/**
* <h1> Java Program demonstrating the usage of Instance Initializer Block (IIB) </h1>
* IIB's contains the code that are used to initialize common parts of various constructors
* IIB's are executed each time the class is instantiated and is executed before the constructors
* IIB's are executed from top to bottom in class and from parent to child in inheritance hierarchy
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class Parent{
  {
    System.out.println("Parent class Instance Initializer Block 1");
  }
  
  public Parent(){
     System.out.println("Parent class constructor");
  }
  
  {
    System.out.println("Parent class Instance Initializer Block 2");
  }
}
