/**
* <h1> Deserialization is a method of reading an object from a saved state in a file </h1>
* Class should implement Serializable interface
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

import SerializationDemo;
public class DeserializationDemo implements Serializable{
       public static void main(String[] args){
         try{
              File file = new File("SerializationDemo.java");
              FileInputStream fis = new FileInputStream(file);
              ObjectInputStream ois = new ObjectInputStream(fis);
              System.out.println(ois.readObject().toString());
         }
         catch(Exception e){
              e.printStackTrace();
         }
      }
}
  
