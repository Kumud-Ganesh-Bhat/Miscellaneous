/**
* <h1> Creating object using java.lang.Class.forName(String classname).newInstance() method </h1>
* There is a predefined class Class in java.lang package. 
* On calling forName(String classname) method, object of Class associated with string classname will be created.
* On calling newInstance method on this Class object will create an object of class specified by String classname
* Note: We have to give fully qualified name of class in String classname
*
* @author: Kumud Bhat
* @version: 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class NewInstanceDemo(){
   int x = 10; 
   public static void main(String[] args){
     
    try{
          NewInstanceDemo nd = (NewInstanceDemo)Class.forName(NewInstanceDemo).newInstance();
          System.out.println(nd.x);
    }
    catch(InstantiationException ie){
          ie.printStackTrace();
    }
    catch(IllegalAccessException iae){
          iae.printStackTrace();
    }
    catch(ClassNotFoundException cfe){
          cfe.printStackTrace();
    }
   }
}
