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

    public List<String> getBookTitles() {
    return bookList.stream().map(Book::getTitle).collect(Collectors.toList());
    }

    public String getTitleCSV(){
         return bookList.stream().map(Book::getTitle).collect(Collectors.joining(","));
    }

    public String getTitleByCSV() {
        StringBuilder sb = new StringBuilder();
        for (Book book : bookList) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(book.getTitle());
        }
        return sb.toString();
    }

    public Map<String,Double> getTitlePrice(){
        return bookList.stream().collect(Collectors.toMap(Book::getTitle,Book::getPrice));
    }

    public Map<String,Double> getTitlePriceCSV(){
        Map<String,Double> map = new HashMap<>();
        Iterator<Book> it = bookList.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            map.put(book.getTitle(),book.getPrice());
        }
        return map;
    }

//    public Map<String,List<String>> booksByAuthor(){
//        return bookList.stream().collect(Collectors.groupingBy(Book::getAuthor,));
//    }

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
