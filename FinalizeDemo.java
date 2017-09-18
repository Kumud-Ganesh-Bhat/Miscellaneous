/**
* <h1> Java Program demonstrating the usage of finalize method </h1>
* finalize method is called by Garbage Collector on an object meant to be dereferenced
* Even though object is eligible for Garbage Collection multiple times, finalize method can be called only once on an object
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "Geeks For Geeks"
*
*/

public class FinalizeDemo{
  
    public static void main(String[] args){
          FinalizeDemo fd = new FinalizeDemo();
          System.out.println(fd.toString() + " " + fd.hashCode());
          fd = null;
          finalize();
          System.gc();
    }
  
    protected void finalize(){
         System.out.println("End");
    }
}
