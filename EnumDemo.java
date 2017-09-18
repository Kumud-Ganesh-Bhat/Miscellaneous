/**
* <h1> Java Program to demonstrate the uasge of enum </h1>
* enum declaration can be done inside/outside the class but not inside the method
* In java every enum implicitly extends java.lang.Enum class
*
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

//enum declaration outside the class
enum Months{
       JANUARY, FEBRAUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
  
       //constructor which is invoked separately for each constant
       private Months(){
         System.out.println("Constructor invoked for Month" + " " + this.toString() + " " + "and it is present at index" + " " + this.toString().ordinal());
       }
  
       public void birthdayMonth(){
          System.out.println("December");
       }
}

public class EnumDemo{
       
       Months month;
      
       public EnumDemo(Months month){
              this.month = month;
       }
  
       public void monthIsLike(){
         switch(month){
           case JANUARY:   System.out.println("Tanning month");
                           break;
           case FEBRAUARY: System.out.println("Wood-gathering month");
                           break;
           case MARCH:     System.out.println("Spring month");
                           break;
           case APRIL:     System.out.println("Grass month");
                           break;
           case MAY:       System.out.println("Blossom month");
                           break;
           case JUNE:      System.out.println("Summer month");
                           break;
           case JULY:      System.out.println("Hay month");
                           break;
           case AUGUST:    System.out.println("Harvest month");
                           break;
           case SEPTEMBER: System.out.println("Autumn month");
                           break;
           case OCTOBER:   System.out.println("Wine month");
                           break;
           case NOVEMBER:  System.out.println("Slaughter month");
                           break;
           case DECEMBER:  System.out.println("Winter month");
                           break;
           default:        System.out.println("This are the months and we will sing it more than a once");
         }
       }
  
      public static void main(String[] args){
          EnumDemo ed = new EnumDemo(Month.valueOf("DECEMBER"));
          ed.monthIsLike();
          Months m1 = Months.DECEMBER;
          m1.birthdayMonth();
      }
}
        
  
  
      
  
