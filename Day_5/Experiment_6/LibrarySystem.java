package Day_5.Experiment_6;
//base class
class LibraryItemAll {
    private String title;
    private boolean isCheckedOut;


    public LibraryItemAll(String title) {
        this.title = title;
        this.isCheckedOut = false;
    }

    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not checked out.");
        }
    }

    public String getTitle() {
        return title;
    }
}

//this is the subclasses calling the constructor of LibraryItemAll

class Book extends LibraryItemAll {
    public Book(String title) {
        super(title);  
    }
}
class DVD extends LibraryItemAll {
    public DVD(String title) {
        super(title);
    }
}
class Journal extends LibraryItemAll {
    public Journal(String title) {
        super(title);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        DVD dvd = new DVD("Inception");
        Journal journal = new Journal("Nature Journal");

        book.checkOut();
        book.returnItem();
        dvd.checkOut();
        journal.returnItem();
    }
}

