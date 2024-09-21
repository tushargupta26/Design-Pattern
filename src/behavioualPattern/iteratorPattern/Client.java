package behavioualPattern.iteratorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book(180, "Science"),
                new Book(100, "maths"),
                new Book(50, "Eng")
        );

        Library lib = new Library(books);
        Iterator it = lib.createIterator();
        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getBookName());
        }
    }
}
