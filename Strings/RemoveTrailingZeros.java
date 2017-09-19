/** 
* <h1> Java Program to remove trailing zeros from String</h1>
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksforGeeks"
*
*/

public class RemoveTrailingZeros{
       public static void main(String[] args){
              StringBuilder sbl = new StringBuilder("000012305690"); //use StringBuilder class because String objects are immutable
              System.out.println("Before Removing zeros" + " " + sbl.toString());
              int count = 0;
              while(sbl.charAt(i) == '0'){
                   count++;
              }
             sbl.replace(0,count, " " );
             System.out.println("After Removing zeros" + " " + sbl);
       }
}
