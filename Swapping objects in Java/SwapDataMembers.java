/**
* <h1> Swapping objects by swapping their data members </h1>
* However, this method is inefficient if the data members list is too big and if we are not aware of data members of class
*
* @author KumudBhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/

public class SwapDataMembers{
  
        int x;
  
        public SwapDataMembers(int x){
               this.x = x;
        }
  
        public static void swap(SwapDataMembers s1, SwapDataMembers s2){
               int temp;
               temp = s1.x;
               s1.x = s2.x;
               s2.x = temp;
        }
  
       public static void main(String[] args){
              SwapDataMembers s1 = new SwapDataMembers(10);
              SwapDataMembers s2 = new SwapDataMembers(20);
              swap(s1,s2);
              System.out.println("S1 :" + s1.x);
              System.out.println("S2 :" + s2.x);
       }
  
}
