/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.util.List;
import java.io.IOException;

/**
 *
 * @author kumud
 */
public class ReadXMLFile_SAXParser {
    
    public static void main(String[] args){
        try{
            //factory API that allows an application to configure and obtain SAXParser to parse XML documents
            SAXParserFactory saxParserFctory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFctory.newSAXParser();
            
            MyBookHandler bookHandler = new MyBookHandler(); 
            
            saxParser.parse("C:\\Users\\kumud\\Documents\\NetBeansProjects\\TextSearchEngine\\src\\assignment\\books.xml", bookHandler);
            
            //Get Book List
            List<Book> bookList = bookHandler.getBookList();
            for(Book book : bookList)
                System.out.println("Book ID " + book.getBookID()
                                    + "\n" + "Book Title " + book.getBookTitle()
                                    + "\n" + "Book Author " + book.getBookAuthor()
                                    + "\n" + "Book Genre " + book.getBookGenre()
                                    + "\n" + "Book Price " + book.getBookPrice()
                                    + "\n" + "Published Date " + book.getPublishedDate()
                                    + "\n" + "Book Description " + book.getBookDescription() + "\n");
            
        }
        catch(SAXException se){
            se.printStackTrace();
        }
        catch(ParserConfigurationException pe){
            pe.printStackTrace();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    
}
