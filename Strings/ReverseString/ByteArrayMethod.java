/**
* <h1> Java program to demonstrate the string reverse </h1>
* There are 5 different ways to reverse the string in java
* 2. Converting String to byte array
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class ByteArrayMethod{
       public static void main(String[] args){
              String str = "Kumud Bhat";
              System.out.println("Before Reversing:" + " " + str);
              byte[] strToByte = str.getBytes(); //converting string to byte array
              byte[] result = new byte[strToByte.length];
              for(int i=0; i<strToByte.length; i++){
                    result[i] = strToByte[strToByte.length - i -1];
              }
              System.out.println("After Reversing:" + " " + new String(result));
       }
}
