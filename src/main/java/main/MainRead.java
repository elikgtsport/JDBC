package main;


import dao.BookDaoImpl;
import model.Book;

public class MainRead {
    public static void main(String[] args) {

        BookDaoImpl bookDaoo = new BookDaoImpl();
        Book books = bookDaoo.get(2L);
        System.out.println(books);
        System.out.println(bookDaoo.get(3L));
        bookDaoo.cleanUp();
    }
}
