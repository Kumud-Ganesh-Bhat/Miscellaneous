/**
* <h1> Java Program to demonstrate String initialization and comparison </h1>
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class InitializingAndComparing{
      public static void main(String[] args){
            String str1 = "Kumud"; //Direct Initialization
            String str2 = "Kumud";
            String str3 = "Kushboo";
            String str4 = new String("Kumud"); //Dynamic initialization using new operator
            String str5 = new String("Kumud");
        
            //Comparing the equality of contents of a string
            System.out.println(str1.equals(str2)); //true
            System.out.println(str2.equals(str4)); //true
            System.out.println(str1.equals(str3)); //false
        
           //Comparing the equality of references 
           System.out.println(str1 == str2); //true
           System.out.println(str1 == str4); //false
           System.out.println(str4 == str5); //false
      }
}
        
            
          
