package Day_5;
public class Book extends LibraryItem {
    private  int CountBook;
    public Book(String title,String Author,int libID, boolean isCheckout,int CountBook){
        super(title,Author,libID,isCheckout);
        this.CountBook=CountBook;
        CountBook++;
    }
    public void showDetails() {
        super.ShowDetails(); // this will Call parent class method
        System.out.println("Number of Book issued: " + CountBook);
    }
}

