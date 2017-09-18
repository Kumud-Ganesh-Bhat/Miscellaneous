/** 
* <h1> Java Program to demonstrate the string reverse </h1>
* 4. Converting String to character array
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class CharArrayMethod2{
  
       public static void main(String[] args){
        
            String str = "Kumud Bhat";
            int lindex; //left index
            int rindex; //right index
            int i=0; //loop variable
        
            System.out.println("Before Reversing:" + str);
        
            char[] strToChar = str.toCharArray(); //converting string to character array
      
            lindex = 0;
            rindex = strToChar.length - 1;
        
            for(lindex = 0; lindex<rindex; lindex++,rindex--){ //swapping
                char c;
                c = strToChar[lindex];
                strToChar[lindex] = strToChar[rindex];
                strToChar[rindex] = c;
            }
        
            System.out.print("After Reversing:" + " ");
        
            while(i < strToChar.length){
                  System.out.print(strToChar[i]);
                   i++;
            }
     
        
            System.out.println();
    }
