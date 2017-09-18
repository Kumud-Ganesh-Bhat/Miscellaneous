/**
* <h1> Child class inheriting features of parent class Bike </h1>
*
* @author "GeeksForGeeks"
* @version 1.0
*
*/

public class MountainBike extends Bike{
      
       int seatHeight;
  
       public MountainBike(int speed, int noGears, int seatHeight){
             super(speed, noGears);
             this.seatHeight = seatHeight;
       }
  
      public void setHeight(int newValue){
             seatHeight = newValue;
      }
  
     public String toString(){
            return(super.toString() + "Seat Height:" + " " + this.seatHeight);
     }
  
}
      
