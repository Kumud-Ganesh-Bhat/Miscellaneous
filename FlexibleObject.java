/**
* <h1> Flexible nature of java.lang.Object </h1>
* It is interesting fact that if java supports a feature where we can assign value of any data type to a variable similar to Python
* It is found that similar feature is provided by Object class
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class FlexibleObject{
  
   public static void main(String[] args){
       
       Object x;
     
       x = 10;
       System.out.println(x.getClass().getName());
     
       x = 'K';
       System.out.println(x.getClass().getName());
     
       x = false;
       System.out.println(x.getClass().getName());
     
   }
  
}
     
