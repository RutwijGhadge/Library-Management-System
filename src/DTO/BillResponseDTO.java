package DTO;

import Models.User;

public class BillResponseDTO {
    public int billId;
    public User user;
    public String bookName;
    public double amountToBePaid;

    @Override
    public String toString() {
        return  "BillResponseDTO {\n" +
                "  billId='" + billId + "',\n" +
                "  user={\n" +
                "    id='" + user.getId() + "',\n" +
                "    name='" + user.getName() + "',\n" +
                "    emailId='" + user.getEmailId() + "',\n" +
                "    contactNumber='" + user.getContactNumber() + "'\n" +
                "  },\n" +
                "  bookName='" + bookName + "',\n" +
                "  amountToBePaid='" + amountToBePaid + "'\n" +
                '}';
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public double getAmountToBePaid() {
        return amountToBePaid;
    }

    public void setAmountToBePaid(double amountToBePaid) {
        this.amountToBePaid = amountToBePaid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
