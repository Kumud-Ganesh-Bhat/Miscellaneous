/**
* <h1> Creating object using Object.clone() method. </h1>
* Class should implement Cloneable interface and override clone method. Otherwise CloneNotSupportedException will be thrown
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class CloneDemo implements Cloneable{
  
        int x = 10;
  
        protected Object clone() throws CloneNotSupportedException{
                   return super.clone();
        }
  
        public static void main(String[] args){
                   CloneDemo cd1 = new CloneDemo();
                   try{
                         CloneDemo cd2 = (CloneDemo)c1.clone();
                         System.out.println(cd2.x);
                   } //try
                   catch(CloneNotSupportedException ce){
                        ce.printStackTrace();
                   } //catch
        } //main
} //class
         
