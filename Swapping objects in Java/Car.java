/**
* <h1> Best method to swap objects in Java is to create Wrapper classes containing references of class and swap
* references of Wrapper class to swap objects of class </h1>
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class Car{
        int carNo;
        String model;
        String color;
     
        public Car(int carNo, String model, String color){
             this.carNo = carNo;
             this.model = model;
             this.color = color;
        }
  
       public static void printInfo(){
             System.out.println("Car Number:" + " " + this.carNo + "\n" +
                                "Car Model:" + " " + this.model + "\n"  +
                                "Car Color:" + " " + this.color);
       }
  
      public static void swap(CarWrapper cw1, CarWrapper cw2){
             Car c;
             c = cw1.c;
             cw1.c = cw2.c;
             cw2.c = c;
      }
  
      //Recommended to create separate Driver class to write program in modular way
      public static void main(String[] args){
          Car c1 = new Car(9058, "Maruti", "White");
          Car c2 = new Car(9698, "Alto", "White");
          //Create objects of class which is defined later - Forward Declarations is not required in Java
          CarWrapper cw1 = new CarWrapper(c1);
          CarWrapper cw2 = new CarWrapper(c2);
          swap(cw1,cw2);
          cw1.printInfo();
          cw2.printInfo();
      } //main
  
} //class Car
  
class CarWrapper{
  
      Car c;
  
      public CarWrapper(Car c){
            this.c = c;
      }
  
}
                                
