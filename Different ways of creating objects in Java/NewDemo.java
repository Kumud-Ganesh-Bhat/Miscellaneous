/**
* <h1> Different ways (5) to create objects in Java </h1>
* Strictly speaking there is only one way that uses new keyword
* Rest internally uses new keyword
* Using new keyword - Most general way of creating objects in Java
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class NewDemo{
    int x =  10;
  public static void main(String[] args){
     NewDemo nd = new NewDemo();
     System.out.println(nd.x);
  }
}
