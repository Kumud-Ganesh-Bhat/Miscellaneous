/**
* <h1>Java Program to reverse a String </h1>
* 5.   Using ArrayList method
* i.   Convert a String to character array
* ii.  Add it to Collections 
* iii. Use Collections.reverse method
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "Geeks for Geeks"
*
*/
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayListMethod{
     public static void main(String[] args){
            String str = "Kumud Bhat";
            System.out.println("Before Reversing:" + " " + str);
            char[] strToChar = str.toCharArray(); //converting string to character array
            List<Character> li = new ArrayList<Charatcer>();
            for(char ch: strToChar){
                 li.add(ch);
            }
            Collections.reverse(li);
            ListIterator literator = li.listIterator();
            System.out.print("After reversing:" + " " );
            while(literator.hasNext())
                 System.out.print(literator.next());
            System.out.println();
     }
}
