package behavioualPattern.iteratorPattern;

import java.util.List;

public class Library {

    private List<Book> booksList;

    public Library(List<Book> book) {
        this.booksList = book;
    }

    public Iterator createIterator(){
        return new BookIterator(booksList);
    }
}
