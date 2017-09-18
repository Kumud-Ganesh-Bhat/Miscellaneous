/**
* <h1> Java Program to demonstrate the concept of Inheritance </h1>
*
* @author "GeeksForGeeks"
* @version 1.0
*
*/

//Parent or base class
public class Bike{
      //instance variables
      int speed;
      int noGears;
      
      public Bike(int speed, int noGears){
           this.speed = speed;
           this.noGears = noGears;
      }
  
     public void increaseSpeed(int value){
          speed += value;
     }
  
     public void applyBrake(int value){
          speed-= value;
     }
      
     public String toString(){
           return("Speed:" + " " + this.speed+ "\n" + "Number of Gears:" + " " + this.noGears);
     }
}
