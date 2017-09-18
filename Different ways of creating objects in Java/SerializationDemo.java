/**
* <h1> Serialization - Serialization is a method of writing/saving an object to a file </h1>
* <h2> Deserialization - Deserialization is a method of reading an object from a saved state in a file </h2>
* When we serializae and then deserialize an object, JVM actually creates a separate object
* Class should implement Serializable interface
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class SerializationDemo implements Serializable{
  
       public static void main(String[] args){
         
              try{
                   File file = new File("SerializationDemo.java");
                   FileOutputStream fos = new FileOutputStream(file);
                   ObjectOutputStream oos = new ObjectOutputStream(fos);
                   oos.writeObject(new SerializationDemo()); // writing an anonymous object to a file
              }
               catch(Exception e){
                     e.printStackTrace();
               }
       }
}
