package Repository;

import Models.Book;
import Models.BookCopy;

import java.util.HashMap;
import java.util.List;

//This will Contain all the information of Books and Copies Present
public class BookCopyRepository {
    private final HashMap<String, List<Book>> booksCopyRepo;

    public BookCopyRepository() {
       booksCopyRepo = new HashMap<>();
    }
    //String : Book Name
    //BookCopy: Location , id , List<Book>

    public void addBookCopy(Book book) {
        if(booksCopyRepo.containsKey(book.getBookName())){
            List<Book>books=booksCopyRepo.get(book.getBookName());
            books.add(book);
        }else{
            List<Book>books = new java.util.ArrayList<>(List.of());
            books.add(book);
            booksCopyRepo.put(book.getBookName(),books);
        }
        System.out.println("Book Copy Added Successfully");
    }

    //get Total Book Copy Count Present
    public int getBookCopyCount(BookCopy bookCopy){
       return booksCopyRepo.get(bookCopy.getBookName()).size();
    }

}
