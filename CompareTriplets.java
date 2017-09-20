/**
* <h1> Comparing triplets </h1>
* Alice and Bob each submitted problem for HackerRank
* For each problem 3 ratings are given for problem quality, problem originalty, and problem difficulty
* Alice ratings are represented by a0,a1,a2
* Bob ratings are represented by b0, b1, b2
* if ai > bi -> Alice gets points. otherwise Bob gets points
* if ai=bi , none gets points.
* Program returns each respective comparison points
* Input
* <a0,a1,a2> = {4,6,8}
* <bo,b1,b2> = {2,10,8}
* Output
* {2,0}
*/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class CompareTriplets{
  
  public static String compareTriplets(int[] a, int[] b){
        int x = 0;
        int y = 0;
        for(int i=0; i<3; i++){
          if(a[i]>b[i])
             x++;
          else if(a[i] == b[i]){
               x+=0;
               y+=0;
          }
          else
              y++;
        }
    
       int result[] = {x,y};
       
       return(Arrays.toString(result));
  }
  
  public static void main(String[] args){
    
    int[] a = new int[3]; //Alice ratings
    int[] b = new int[3]; //Bob's ratings
    
    Scanner sc = new Scanner(System.in); //reading input from standard input stream
    
    for(int i=0; i<a.length; i++)
            a[i] = sc.nextInt();
    
    for(int j=0; j<b.length; j++)
            b[j] = sc.nextInt();
    
    System.out.println("Alice ratings:");
    for(int x: a)
        System.out.print(x + " " );
    
    System.out.println(+"\n" + "Bob's ratings:");
    for(int y:b)
         System.out.print(y + " ");
    
    System.out.println();
    
    System.out.println("Comparison Triplets:" + compareTriplets(a,b));
  }
}
