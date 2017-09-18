/**
* <h1> Reversing a string in Java </h1>
* 4. Converting String to character array 
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class CharArrayMethod1{
       public static void main(String[] args){
            String str = "Kumud Bhat";
            System.out.println("Before Reversing:" + str);
            char[] strToChar = str.toCharArray(); //converting string to character array
            System.out.print("After Reversing:" + " ");
            for(int i=strToChar.length-1; i>=0; i--)
                System.out.print(strToChar[i]);
            System.out.println();
      }
}
