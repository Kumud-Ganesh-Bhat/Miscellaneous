/**
* <h1> Instance Initializer Block continued </h1>
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class Child extends Parent{
  {
    System.out.println("Child class Initializer Block 1");
  }
  
  public Child(){
    super();
    System.out.println("Child class Constructor");
  }
  
  {
    System.out.println("Child class Initializer Block 2");
  }
}


