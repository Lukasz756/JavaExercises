package Exercises.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void add(Book book){
        this.books.add(book);
    }

    public void delete(String isbn) throws NoBookFoundException {
        for(Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
            return;
            }
        }
        throw new NoBookFoundException("Can't delete book with isbn: "+ isbn);
    }
    public Book findByIsbn(String isbn) throws NoBookFoundException{
        for (Book book : books){
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new NoBookFoundException ("Can't find book with isbn: "+ isbn);
    }
    public Book findByTitle (String title) throws NoBookFoundException{
        for(Book book : books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        throw new NoBookFoundException("Can't find book with title: "+ title);
    }


}
