/**
* <h1> Java program to demonstrate the use of split() method in Strings </h1>
* split() method is used to split the string into tokens around matches of regular experession
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class SplitDemo{
     public static void main(String[] args){
          Stirng str = "Geeks for Geeks";
          String[] tokens = str.split("s", 2);
          for(String s: token)
             System.out.println(s);
     }
}

//Output
//Geek
//for Geeks
