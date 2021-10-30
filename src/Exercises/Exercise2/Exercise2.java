package Exercises.Exercise2;

public class Exercise2 {
    public static void main(String[] args) throws NoBookFoundException{


        BookRepository bookRepository = new BookRepository();
        Book book1 = new Book("1234", "Harry Potter Part I", "J K Rowlling", 1999);

        bookRepository.add(book1);

        System.out.println(bookRepository.findByIsbn("1234"));
        System.out.println(bookRepository.findByTitle("Dune"));
    }
}
