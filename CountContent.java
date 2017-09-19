/**
* <h1> Java Program to Count the number of lines, words, characters, paragraphs in a text file </h1>
* Counting number of characters is important because 
* most of the text boxes that rely on user input have limit on the certain number of characters that can be inserted
*
* @author Kumud Bhat
* @version 1.0
* @source/reference "GeeksForGeeks"
*
*/
import java.io.*;
public class CountContent{
       public static void main(String[] args){
         
              int lineCount = 0; //total number of lines in a file
              int wordCount = 0; //total number of words in a file
              int charCount = 0; //total number of characters in a file
              int paraCount = 1; //assuming atleast one paragraph in a file
         
              try{
                    File file = new File("sample.txt");
                    FileInputStream fis = new FileInputStream(file);
                    InputStreamReader isr = new InputStreamReader(fis);
                    BufferedReader br = new BufferedReader(isr);
             
                    String line ;
                    String[] wordTokens;
                    
                
                    while(line == br.readLine()){
                        if(line.equals(""))
                             paraCount++;
                        else{
                              lineCount++;
                              charCount+= line.length();
                              wordTokens = line.split('\\s+'); //splitting words based on delimiter space
                              wordCount+= wordTokens.length;
                            }
                    } //while
                
                    System.out.println("Number of lines:" + " " + lineCount);
                    System.out.println("Number of characters:" + " " + charCount);
                    System.out.println("Number of words:" + " " + wordCount);
                    System.out.println("Number of paragraphs:" + " " + paraCount);
              } //try
              catch(Exception e){
                    e.printStackTrace();
              } //catch
                       
       } //main
} //class
