/**
* <h1> StringJoiner class is present in java.util package </h1>
* StringJoiner class is used to construct a sequence of characters separated by a delimiter starting with optionally supplied prefix and ending with optionally supplied suffix
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

import java.util.StringJoiner;
import java.util.ArrayList;

public class StringJoinerDemo{
  
    public static void main(String[] args){
      
       ArrayList<String> al = new ArrayList<String>();
       al.add("Ganesh Bhat");
       al.add("Latha Bhat");
       al.add("Kushboo Bhat");
       al.add("Kumud Bhat");
      
       StringJoiner sj1 = new StringJoiner(",");
       sj1.setEmptyValue("Setting the string to be used");
       System.out.println(sj1.toString());
       sj1.add(al.get(0)).add(al.get(1));
       System.out.println(sj1.toString());
      
       StringJoiner sj2 = new StringJoiner(":");
       sj2.add(al.get(2)).add(al.get(3));
       System.out.println(sj2.toString());
      
       sj1.merge(sj2);
       System.out.println(sj1.toString());
    }
}
        
