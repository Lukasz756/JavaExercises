package Exercises.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void add(Book book){
        this.books.add(book);
    }

    public void delete(String isbn){

    }

}
