/**
* <h1> StringTokenizer class is used to split the string into tokens based on the delimiter </h1>
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class StringTokenizerDemo{
     public static void main(String[] args){
         String str = "Java Programming Language";
         StringTokenizer st = new StringTokenizer(str);
         while(st.hasNextToken())
              System.out.println(st.nextToken());
     }
}
