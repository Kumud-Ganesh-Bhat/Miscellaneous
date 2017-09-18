/**
* <h1> Java program to demonstrate the differences between String, StringBuilder, and StringBuffer </h1>
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class String_StringBuilder_StringBuffer{
  
   public static void concat1(String str1){
       str1.concat("Bhat");
   }
  
   public static void concat2(StringBuffer sbr){
       sbr.append("Krishna");
   }
  
   public static void concat3(StringBuilder sbl){
        sbl.append("Bhat");
   }
    
   public static void main(String[] args){
         String str = "Kumud";
         concat1(str);
      
         StringBuffer sbr = new StringBuffer("Ganesh");
         concat2(sbr);
      
         StringBuilder sbl = new StringBuilder("Latha");
         concat(sbl);
      
         System.out.println(str);
         System.out.println(sbr);
         System.out.println(sbl);
    }
  
}

//Output
// Kumud
// Ganesh Krishna
// Latha Bhat
        
