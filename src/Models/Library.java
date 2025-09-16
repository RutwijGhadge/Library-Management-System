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
