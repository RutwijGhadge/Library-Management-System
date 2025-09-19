package Models;

import java.time.LocalDateTime;
import java.util.List;

public class Library {
   public String Name;
   public String Address;
   public LocalDateTime OpeningTime;
   public LocalDateTime ClosingTime;
   public String DaysOfOperation;         //How many days open
   public String Owner;
   public String ContactNumber;
   public List<Book> bookList;
   public Librarian librarian;
   public List<User>users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public LocalDateTime getClosingTime() {
        return ClosingTime;
    }

    public void setClosingTime(LocalDateTime closingTime) {
        ClosingTime = closingTime;
    }

    public LocalDateTime getOpeningTime() {
        return OpeningTime;
    }

    public void setOpeningTime(LocalDateTime openingTime) {
        OpeningTime = openingTime;
    }

    public String getDaysOfOperation() {
        return DaysOfOperation;
    }

    public void setDaysOfOperation(String daysOfOperation) {
        DaysOfOperation = daysOfOperation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
