/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author kumud
 */
public class MyBookHandler extends DefaultHandler {
    
    //List to hold Books object
    private List<Book> bookList = new ArrayList<Book>();
    private Book book = null;
    
    boolean btitle = false;
    boolean bauthor = false;
    boolean bgenre = false;
    boolean bprice = false;
    boolean bpublished_date = false;
    boolean bdescription = false;
    
    public List<Book> getBookList(){
        return bookList;
    }
    
    //Overriding call back methods of handler
    public void startElement(String uri, String localName, String qName, Attributes attributes)throws SAXException{
        if(qName.equalsIgnoreCase("book")){
            //Create a new book to add it to list later
            book = new Book();
            book.setBookID(Integer.parseInt(attributes.getValue("id")));
            
        }
        else if(qName.equalsIgnoreCase("title"))
            btitle = true;
        else if(qName.equalsIgnoreCase("author"))
            bauthor = true;
        else if(qName.equalsIgnoreCase("genre"))
            bgenre = true;
        else if(qName.equalsIgnoreCase("price"))
            bprice = true;
        else if(qName.equalsIgnoreCase("publish_date"))
            bpublished_date = true;
        else if(qName.equalsIgnoreCase("description"))
            bdescription = true;
        
    } //start element
    
    public void endElement(String uri, String localName, String qName) throws SAXException{
        if(qName.equalsIgnoreCase("book"))
            bookList.add(book);
    } //end element
    
    public void characters(char[] ch, int start, int length) throws SAXException{
        if(btitle){
            book.setBookTitle(new String(ch,start,length));
            btitle = false;
        }
        else if(bauthor){
            book.setBookAuthor(new String(ch,start,length));
            bauthor = false;
        }
        else if(bgenre){
            book.setBookGenre(new String(ch,start,length));
            bgenre = false;
        }
        else if(bprice){
            book.setBookPrice(Float.parseFloat(new String(ch, start,length)));
            bprice = false;
        }
        else if(bpublished_date){
            book.setPublishedDate(new String(ch, start,length));
            bpublished_date = false;
        }
        else if(bdescription){
            book.setBookDescription(new String(ch, start, length));
            bdescription = false;
        }
    } //characters method
    
    
 } //main
