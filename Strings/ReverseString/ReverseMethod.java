/**
* <h1> Java program to demonstrate the reversing of a string </h1>
* There are 5 different ways to reverse a string in java
* 1. Using built-in reverse method of StringBuffer/StringBuilder class
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class ReverseMethod {
    
    public static void main(String[] args){
        String str = "Kumud Bhat";
        System.out.println("Before Reversing:" + str);
        StringBuilder sbl = new StringBuilder(); //Using StringBuilder for single thread
        sbl.append(str);
        sbl.reverse();
        str = sbl.toString();
        System.out.println("After Reversing:" + str);
    }
    
}
