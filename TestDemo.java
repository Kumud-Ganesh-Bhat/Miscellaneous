/**
* <h1> Java Program demonstrating the use of java.lang.Class type object to represent .class file in Heap memory </h1>
*
* @author Kumud Bhat
* @version 1.0
*
*/

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestDemo{
  
  public static void main(String[] args){
    
    TestDemo td = new TestDemo();
    Class c1 = td.getClass(); //getting hold of Class object using Object class method getclass()
    System.out.println(c1.getName());
    
    Field[] field = c1.getDeclaredFields(); //getting information about all fields declared in a class
    for(Field f: field)
       System.out.println(f.getName());
    
    Method[] method = c1.getDeclaredMethods(); //getting information about all methods defined in a class
    for(Method m: method)
      System.out.println(m.getName());
    
  }
  
}
    
    
    
