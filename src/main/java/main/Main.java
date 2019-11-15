package main;

import dao.BookDao;
import model.Book;
import dao.BookDaoImpl;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("123456789", "Wilk z Wall Street", "Jordan Belfort");
        Book boosk = new Book("1234567dfdf89", "Wifgfghlk z Wall Street", "Jordafgfgn Belfort");
        Book boosk1 = new Book("856321457812", "Java", "Jim");
        BookDao bookDao = new BookDaoImpl();
        bookDao.save(book);
        bookDao.save(boosk);
        bookDao.save(boosk1);
        System.out.println("Book saved");
        bookDao.cleanUp();


    }
}
