/**
* <h1> Autoboxing - When we assign value of int to Integer object value is autoboxed to an Integer object </h1>
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksforGeeks"
*
*/

public class AutoboxingDemo{
     public static void main(String[] args){
         Integer x = 400;
         Integer y = 400;
         if(x == y)
            System.out.println("Same");
         else
            System.out.println("Not Same"); //output
         Integer x = 40;
         Integer y = 40;
         if(x == y)
             System.out.println("Same"); //output because of range -128 to 127
          else
              System.out.println("Not Same");
       
          Integer x = new Integer(40);
          Integer y = new Integer(40);
          if(x == y)
            System.out.println("Same");
          else
            System.out.println("Not Same"); //output
     }
}
