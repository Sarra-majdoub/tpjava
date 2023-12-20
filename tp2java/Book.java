import java.util.ArrayList;
import java.util.List;

class Book {
    protected String title;
    protected String author;
    protected int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void displayInformation() {
        System.out.println("Title: " + title+"\n"
                        +"Author: " + author +
                "\n"+"Year of Publication: " + year);
    }
}

class Novel extends Book {
    protected String genre;

    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    public void displayInformation() {
        super.displayInformation();
        System.out.println("Genre: " + genre);
    }
}

class Textbook extends Book {
    private String subject ;

    public Textbook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }


    public void displayInformation() {
        super.displayInformation();
        System.out.println("Subject: " + subject);
    }

}

class Library {
    protected List<Book> ListeDeLivres ;

    public Library() {
        this.ListeDeLivres = new ArrayList<>();
    }

    public void addBook(Book book) {
        ListeDeLivres.add(book);
    }
    public void removeBook(Book book) {
        if (ListeDeLivres.contains(book)) {
            ListeDeLivres.remove(book);
            System.out.println("Book removed :" + book.getTitle());
        } else {
            System.out.println("Book not found .");
        }
    }

    public void listAllBooks() {
        if (ListeDeLivres.isEmpty()) {
            System.out.println("The library is empty ");
        } else {
            System.out.println("voici la liste des livres:");
            for (Book book : ListeDeLivres) {
                book.displayInformation();
            }
        }
    }
}

class LibraryCard {
    protected int cardNumber;
    private boolean isActive;

    public LibraryCard(int cardNumber) {
        this.cardNumber = cardNumber;
        this.isActive = true;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void deactivateCard() {
        isActive = false;
    }
}

interface LibraryUser {
    void borrowBook(String bookTitle);
    void returnBook(String bookTitle);
}

class Student implements LibraryUser {
    protected int Id;
    protected LibraryCard libraryCard;

    public Student(int Id, int cardNumber) {
        this.Id = Id;
        this.libraryCard = new LibraryCard(cardNumber);
    }

    public void borrowBook(String Title) {
        if (libraryCard.isActive()) {
            System.out.println("Student  with ID " + Id + " borrowed the book: " + Title);
        } else {
            System.out.println("Student with ID " + Id + " cannot borrow books. Library card is inactive.");
        }
    }
    public void returnBook(String Title) {
        System.out.println("Student with ID " + Id + " is returning the book: " + Title);
    }

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }
}

class Teacher implements LibraryUser {
    protected int Id;
    protected LibraryCard libraryCard;

    public Teacher(int Id, int cardNumber) {
        this.Id = Id;
        this.libraryCard = new LibraryCard(cardNumber);
    }

    public void borrowBook(String Title) {
        if (libraryCard.isActive()) {
            System.out.println("Teacher  with ID " + Id + "  borrowed the book: " + Title);
        } else {
            System.out.println("Teacher  with ID " + Id + " cannot borrow books. Library card is inactive.");
        }
    }
    public void returnBook(String Title) {
        System.out.println("Teacher with ID " + Id + "  returned the book: " + Title);
    }

}

class test{
    public static void main(String[] args) {
        Book novel = new Novel("It ends with us", "Colleen Hoover", 2016 ,"Romance");
        Book textbook = new Textbook("intro to web dev", "sarra", 1945, "Computer Science");

        novel.displayInformation();

        textbook.displayInformation();
        System.out.println("-----------------------------------------");
        Library library = new Library();

        library.addBook(novel);
        library.addBook(textbook);

        library.listAllBooks();

        library.removeBook(novel);
        System.out.println("-----------------------------------------");
        library.listAllBooks();


        Student student = new Student(100,1500);
        Teacher teacher = new Teacher(1001,1458);

        student.borrowBook("intro to web dev");
        student.returnBook("intro to web dev");

        teacher.borrowBook("It ends with us");
        teacher.returnBook("It ends with us");

        student.getLibraryCard().deactivateCard();

        student.borrowBook("Another Book");
    }
}

