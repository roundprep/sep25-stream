package com.acme.libmanager.service;

import com.acme.libmanager.model.Author;
import com.acme.libmanager.model.Book;

import java.util.*;
import java.util.stream.Collectors;

public class LibManagerService {
    private List<Book> bookList = new ArrayList<>();

    public LibManagerService() {
       init();
    }

    // get book
    public List<Book> getBookList() {
        return bookList;
    }

    public Optional<Book> getBookByTitle(String title) {
        return bookList.stream().filter(b -> b.getTitle().equalsIgnoreCase(title.trim())).findFirst();
    }

    public String getBookTitles() {
        return bookList.stream().map(Book::getTitle).collect(Collectors.joining(","));
    }
   public Map<String, Double> getBookTitlesWithPrice() {
        return bookList.stream().collect(Collectors.toMap(Book::getTitle, Book::getPrice));
    }


    public Map<String, Double> getBookTitlesWithPriceWithoutMap() {
        Map<String, Double> map = new HashMap<>();
        Iterator<Book> iterator = bookList.listIterator();

        while (iterator.hasNext()){
            Book b = iterator.next();
            map.put(b.getTitle(), b.getPrice());

        }
        return map;


    }





    public void init() {
       bookList.add( new Book("Learning Java",new Author("Chetan","chetain@gmail.com"),
                    "progmming", 39.99, Arrays.asList("Java","Spring")));

        bookList.add( new Book("Learning Pythin",new Author("Chetan","chetain@gmail.com"),
                "progmming", 19.99, Arrays.asList("Python","AI")));

        bookList.add( new Book("Practical Java",new Author("Divya","divya@gmail.com"),
                "progmming", 69.99, Arrays.asList("Java","Spring")));
        bookList.add( new Book("Mastering Java",new Author("Divya","divya@gmail.com"),
                "progmming", 39.99, Arrays.asList("Java","Spring")));
        bookList.add( new Book("Learning C",new Author("Ahan","ahan@gmail.com"),
                "progmming", 39.99, Arrays.asList("OOPS","C")));
        bookList.add( new Book("Web Development",new Author("Zeel","zeel@gmail.com"),
                "progmming", 39.99, Arrays.asList("HTML","CSS","JS")));
        bookList.add( new Book("CSS in Depth",new Author("Zeel","zeel@gmail.com"),
                "progmming", 39.99, Arrays.asList("CSS","Tailwind")));

    }

}
