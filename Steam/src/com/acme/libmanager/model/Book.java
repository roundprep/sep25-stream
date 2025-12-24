package com.acme.libmanager.model;

import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private String category;
    private double price;
    private List<String> tags;

    public Book(String title, Author author, String category, double price, List<String> tags) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(category, book.category) && Objects.equals(tags, book.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, category, price, tags);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", tags=" + tags +
                '}';
    }
}
