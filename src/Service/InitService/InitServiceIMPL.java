package Service.InitService;

import Models.*;
import Models.Constants.BookStatus;
import Models.Constants.Category;
import Repository.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitServiceIMPL implements initService {

    private final BookRepository bookRepository;
    private final BookCopyRepository bookCopyRepository;
    private final UserRepository userRepository;

    public InitServiceIMPL(BookRepository bookRepository, UserRepository userRepository, BookCopyRepository bookCopyRepository, ReceiptRepository receiptRepository, BillRepository billRepository) {
        this.bookRepository = bookRepository;
        this.bookCopyRepository = bookCopyRepository;
        this.userRepository=userRepository;
    }

    @Override
    public void init() {
        Library library=new Library();
        library.setName("Young Brigade Library");
        library.setAddress("S.P.Bapat Road,Pune");
        library.setOpeningTime( LocalDateTime.of(2025, 9, 16, 7, 0));
        library.setClosingTime(LocalDateTime.now()
                .withHour(7)
                .withMinute(0));
        library.setOwner("Rutwij Ghadge");
        library.setContactNumber("83083123645");
        library.setDaysOfOperation("Monday,Tuesday,Wednesday,Thursday,Friday,Saturday");
        library.setBookList(addBooks());
        library.setLibrarian(setLibrarian());
        library.setUsers(addUsers());
    }

    public List<Book> addBooks(){
        Book b0 = new Book(Category.DRAMA, "English", 240.00, "R.V.Tupe", "Verma Publication", "How to be Unique", 1L, BookStatus.RESERVED);
        Book b1 = new Book(Category.DRAMA, "English", 240.00, "R.V. Tupe", "Verma Publication", "How to be Unique", 20L,BookStatus.AVAILABLE);
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
        for(Book book : books){
            bookRepository.save(book);
            bookCopyRepository.addBookCopy(book);
        }
        return books;
    }

    public List<User> addUsers(){
        List<User> users = Arrays.asList(
                new User("alice@example.com", "9876543210", "123 Maple Street, NY", "Alice Johnson", 1),
                new User("bob@example.com", "8765432109", "456 Oak Avenue, LA", "Bob Smith", 2),
                new User("charlie@example.com", "7654321098", "789 Pine Road, SF", "Charlie Brown", 3),
                new User("diana@example.com", "6543210987", "321 Elm Lane, TX", "Diana Prince", 4),
                new User("ethan@example.com", "5432109876", "654 Cedar Blvd, FL", "Ethan Hunt", 5),
                new User("fiona@example.com", "4321098765", "987 Birch Street, WA", "Fiona Gallagher", 6),
                new User("george@example.com", "3210987654", "246 Walnut Drive, NV", "George Miller", 7),
                new User("hannah@example.com", "2109876543", "135 Cherry Lane, OR", "Hannah Williams", 8),
                new User("ian@example.com", "1098765432", "864 Aspen Road, CO", "Ian Somerhalder", 9),
                new User("julia@example.com", "9988776655", "753 Poplar Street, AZ", "Julia Roberts", 10),
                new User("kevin@example.com", "8877665544", "159 Redwood Blvd, IL", "Kevin Hart", 11),
                new User("linda@example.com", "7766554433", "951 Cypress Ave, MI", "Linda Davis", 12),
                new User("michael@example.com", "6655443322", "357 Palm Street, MA", "Michael Jordan", 13),
                new User("nina@example.com", "5544332211", "258 Magnolia Lane, GA", "Nina Dobrev", 14),
                new User("oliver@example.com", "4433221100", "147 Spruce Court, NJ", "Oliver Queen", 15),
                new User("paula@example.com", "3322110099", "369 Dogwood Road, PA", "Paula Patton", 16),
                new User("quentin@example.com", "2211009988", "741 Fir Street, OH", "Quentin Tarantino", 17),
                new User("rachel@example.com", "1100998877", "852 Sequoia Ave, WI", "Rachel Green", 18),
                new User("samuel@example.com", "1009887766", "963 Willow Road, MN", "Samuel Jackson", 19),
                new User("tina@example.com", "9098776655", "159 Hickory Lane, VA", "Tina Fey", 20)
        );

        for(User user: users){
            userRepository.addUser(user);
        }

        return users;
    }

    public Librarian setLibrarian(){
        Librarian librarian=new Librarian();
        librarian.setName("Nilesh Gadge");
        librarian.setEmailId("nileshgadge@gmail.com");
        librarian.setContactNumber("1234567856");
        return librarian;
    }

}
