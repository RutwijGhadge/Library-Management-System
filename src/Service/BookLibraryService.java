package Service;

import Models.Book;
import Models.BookCopy;
import Models.Constants.BookStatus;
import Models.Constants.Category;
import Repository.BookCopyRepository;
import Repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookLibraryService {
    private final BookRepository bookRepository=new BookRepository();
    private final BookCopyRepository bookCopyRepository=new BookCopyRepository();


    public void addBooks(BookRepository bookRepository) {
        Book b0 = new Book(Category.DRAMA, "English", 240.00, "R.V.Tupe", "Verma Publication", "How to be Unique", 1L, BookStatus.NOT_AVAILABLE);
        Book b1 = new Book(Category.DRAMA, "English", 240.00, "R.V. Tupe", "Verma Publication", "How to be Unique", 1L,BookStatus.AVAILABLE);
        Book b2 = new Book(Category.FICTION, "English", 199.50, "J.K. Rowling", "Bloomsbury", "Harry Potter and the Philosopher's Stone", 2L,BookStatus.AVAILABLE);
        Book b3 = new Book(Category.EDUCATION, "English", 350.00, "Stephen Hawking", "Bantam Books", "A Brief History of Time", 3L,BookStatus.AVAILABLE);
        Book b4 = new Book(Category.HISTORY, "Hindi", 180.00, "Romila Thapar", "Penguin India", "Ancient India", 4L,BookStatus.AVAILABLE);
        Book b5 = new Book(Category.BIOGRAPHY, "English", 275.00, "Walter Isaacson", "Simon & Schuster", "Steve Jobs", 5L,BookStatus.AVAILABLE);
        Book b6 = new Book(Category.EDUCATION, "English", 420.00, "Joshua Bloch", "Addison-Wesley", "Effective Java", 6L,BookStatus.AVAILABLE);
        Book b7 = new Book(Category.FANTASY, "English", 300.00, "J.R.R. Tolkien", "HarperCollins", "The Hobbit", 7L,BookStatus.AVAILABLE);
        Book b8 = new Book(Category.POETRY, "Marathi", 150.00, "Kusumagraj", "Continental Prakashan", "Vishakha", 8L,BookStatus.NOT_AVAILABLE);
        Book b9 = new Book(Category.FICTION, "English", 220.00, "George Orwell", "Secker & Warburg", "1984", 9L,BookStatus.AVAILABLE);
        Book b10 = new Book(Category.DRAMA, "English", 260.00, "William Shakespeare", "Oxford Press", "Hamlet", 10L,BookStatus.AVAILABLE);
        Book b11 = new Book(Category.EDUCATION, "English", 310.00, "Carl Sagan", "Random House", "Cosmos", 11L,BookStatus.AVAILABLE);
        Book b12 = new Book(Category.HISTORY, "English", 200.00, "Yuval Noah Harari", "Harper", "Sapiens: A Brief History of Humankind", 12L,BookStatus.AVAILABLE);
        Book b13 = new Book(Category.EDUCATION, "English", 500.00, "Robert C. Martin", "Prentice Hall", "Clean Code", 13L,BookStatus.AVAILABLE);
        Book b14 = new Book(Category.BIOGRAPHY, "English", 280.00, "Anne Frank", "Contact Publishing", "The Diary of a Young Girl", 14L,BookStatus.AVAILABLE);
        Book b15 = new Book(Category.FANTASY, "English", 350.00, "C.S. Lewis", "Geoffrey Bles", "The Lion, the Witch and the Wardrobe", 15L,BookStatus.AVAILABLE);

        List<Book> books = new ArrayList<>(List.of(b0, b1, b2, b3, b4, b5, b6, b7,b8, b9,b10,b11,b12,b13,b14,b15));
        bookRepository.saveAll(books); //bookCopies will also get saved
    }

    public int checkIfCopiesAvailable(BookCopy bookCopy,BookRepository bookRepository,Book book){
        Book book1=new Book();
        book1=bookRepository.findById(book.getId());
        //Book is present in Repository
        int cnt=0;
        List<Book>books=bookCopy.getBooks();
        for(Book b:books){
            if(b.getBookStatus()==BookStatus.AVAILABLE)
                cnt++;
        }
        return cnt;
    }
}
