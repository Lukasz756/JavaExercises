package Exercises.Collections.Ex2;

import java.util.ArrayList;
import java.util.List;

public class BookService
{
    private List<Book> books = new ArrayList<>();
    public void add(Book book){
        books.add(book);
    }
    public void remove (Book book){
        books.remove(book);
    }
    public List<Book> getAll(){
        return books;
    }
    public List<Book> findByGenre(Genre genre){
        List<Book> results = new ArrayList<>();
        for(Book book : books){
            if(book.getGenre()==genre){
                results.add(book);
            }
        }
        return results;
    }
    public List<Book> findByYear(int year){
        List<Book> results = new ArrayList<>();
        for(Book book : books){
            if(book.getYear()==year){
                results.add(book);
            }
        }
        return results;
    }

}
