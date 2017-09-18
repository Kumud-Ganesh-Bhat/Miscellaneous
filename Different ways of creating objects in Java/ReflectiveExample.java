/**
* <h1> Creating object using newInstance method of Constructor class. </h1>
* This is similar to creating object using  newInstance method of Class. 
* In fact, internally new Instance method of Class uses newInstance method of Constructor class
* Both are considered as reflective ways of creating objects in Java
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

import java.lang.reflect.Constructor;

public class ReflectiveExample{
     int x = 10;
     public static void main(String[] args){
        try{
             Constructor<ReflectiveExample> constructor = ReflectiveExample.class.getDeclaredConstructor();
             ReflectiveExample re = (ReflectiveExample) constructor.newInstance();
             System.out.println(re.x);
        }
        catch(Exception e){
             e.printStackTrace();
        }
     }
}
