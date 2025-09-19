package Repository;

import Models.Book;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import Exception.BookNotPresentException;

//This Repo will handle the Methods :
// Individual book ,
// Returning all books ,
// Find Book by ID
public class BookRepository {

    private final HashMap<Long,Book> bookRepository;
    private final BookCopyRepository bookCopyRepository= new BookCopyRepository();


    public BookRepository() {
        this.bookRepository = new HashMap<>();
    }

    public void save(Book book){
        //check if the book id is present or not : if not -> assign book Id and store in repo
        bookRepository.put(book.getId(),book);
    }

    public void saveAll(List<Book>books){
        for(Book book:books){
            save(book);
            //BookCopy will also get updated
        }
    }

    public Book findById(Long id)  {
        if(!bookRepository.containsKey(id)){
            throw new BookNotPresentException("Book with Id :"+ id +" is Not Present");
        }
       return bookRepository.get(id);
    }

}
