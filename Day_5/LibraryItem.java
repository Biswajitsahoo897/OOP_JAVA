package Day_5;
// Create a class hierarchy for a library system with classes such as LibraryItem, Book, DVD, and Journal. 
// Implement methods for checking out and returning items.
public class LibraryItem{
    public String Author;
    public int LibID;
    public boolean isCheckout;
    public String title;

    LibraryItem(String title,String Author,int libID,boolean isCheckout){
        this.Author=Author;
        this.LibID=libID;
        this.isCheckout=false;
        this.title=title;
    }

    //created a constructor by using this keyword
    void ShowDetails(){
        System.out.println("Author:"+Author);
        System.out.println("Library ID :"+LibID);
        System.out.println("Checked out Status:"+isCheckout);
        System.out.println("Title :");
    }
    public void checkout(){
        if(isCheckout){
            isCheckout=false;
            System.out.println(this.title+" Has been checked out");
        }
        else{
            System.out.println(this.title+" Has not been checked out");
        }

    }   

    public void returnItem(){
        if (isCheckout) {
            isCheckout=false;
            System.out.println(this.title+" Has been returned");
            
        }
        else{

            System.out.println(this.title+" Hasn't been returned");
        }
    }

    // this is the main fuction where each and every function will call 
    public static void main(String[] args) {
        DVD dvd = new DVD("Inception", "Christopher Nolan", 101, false, 148);
        Journal journal = new Journal("AI Research", "John Doe", 102, false, "February 2024", 12);
        Book Book1 =new Book("Java Programming", "James Gosling", 103, false, 5);
        dvd.showDetails();

        journal.showDetails();
        journal.checkout();
        journal.returnItem();

        Book1.showDetails();
        Book1.checkout();
        Book1.returnItem();

   }
}
