
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Library {
    private ArrayList<Book> list;
    public Library(){
        list = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook){
        list.add(newBook);
    }
    
    public void printBooks(){
        for(Book book : list){
            System.out.println(book);
        }
    }
    
    // title search
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : list){
            if(StringUtils.included(book.title(), title)){
                found.add(book);
            }
        }
        return found;
    }
    
    // publisher search
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : list){
            if(StringUtils.included(book.publisher(), publisher)){
                found.add(book);
            }
        }
        return found;
    }
    
    // search by year
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : list){
            if(book.year() == year){
                found.add(book);
            }
        }
        return found;
    }
    
    
}
