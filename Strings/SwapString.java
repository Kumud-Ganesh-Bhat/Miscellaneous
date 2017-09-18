/** 
* <h1> Java Program to swap the strings without using third variable </h1>
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class SwapString{
      public static void main(String[] args){
        
             String str1 = "Kumud";
             String str2 = "Bhat";
        
             System.out.println("Before Swapping:" + "\n" + "Str1:" + " " + str1 + "\n" + "Str2:" + " " + str2);
        
             str1 = str1.concat(str2);
             str2 = str1.subString(0, (str1.length() - str2.length()));
             str1 = str1.subString(str2.length());
        
             System.out.println("After Swapping:" + "\n" + "Str1:" + " " + str1 + "\n" + "Str2:" + " " + str2);
      }
}
        
        
             
        
           
