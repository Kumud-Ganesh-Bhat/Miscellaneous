/**
* <h1> Encapsulation - Method of wrapping data and code that operates on it under a single unit </h1>
* Advantages - Data Hiding, Unit Testing, Flexibility (Read only or Write only)
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class EncapsulationDemo{
  
       private String authorName;
       private String designation;
       private long contactNo;
       
       //setter methods
       public void setAuthorName(String authorName){
              this.authorName = authorName;
       }
  
       public void setDesignation(String designation){
              this.designation = designation;
       }
  
       public void setContactNo(long contactNo){
              this.contactNo = contactNo;
       }
  
      //getter methods
      public String getAuthorName(){
             return (this.authorName);
      }
  
      public String getDesignation(){
             return (this.designation);
      }
  
      public long getContactNo(){
             return (this.contactNo);
      }
}


