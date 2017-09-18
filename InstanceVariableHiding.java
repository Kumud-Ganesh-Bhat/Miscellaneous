/**
* <h1> Instance Variable Hiding Demo </h1>
* When we declare local variable with same name as that of instance variable, then we say local variable is hiding instance variable
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class InstanceVariableHiding{
      int x = 10; //instance variable
      public static void main(String[] args){
        int x = 20; //local variable
        System.out.println(x); //prints 20
        System.out.println(new InstanceVariableHiding().x); //prints 10
      }
}
