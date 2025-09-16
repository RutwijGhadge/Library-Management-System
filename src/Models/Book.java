package Models;

import Models.Constants.BookStatus;
import Models.Constants.Category;

public class Book {
   public Long id;
   public String bookName;
   public String publisher;
   public String author;
   public double price;
   public String language;
   public Category category;
   public BookStatus bookStatus;


    public Book(){}

    public Book(Category category, String language, double price, String author, String publisher, String bookName, Long id , BookStatus bookStatus) {
        this.category = category;
        this.language = language;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
        this.bookName = bookName;
        this.id = id;
        this.bookStatus=bookStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category =category;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

}
