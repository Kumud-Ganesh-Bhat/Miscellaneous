/**
* <h1> Java program to demonstrate the concept of Method Overloading </h1>
* 
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*/

public class Sum{
  
     public int sum(int x, int y){
           return (x+y);
     }
  
    public int sum(int x, int y, int z){
           return (x+y+z);
    }
  
    public double sum(double x, double y){
            return (x+y);
    }
  
    public static void main(String[] args){
          Sum s = new Sum();
          System.out.println(s.sum(10,20));
          System.out.println(s.sum(10,20,30));
          System.out.println(s.sum(10.0,20.0));
    }
 
}
  
