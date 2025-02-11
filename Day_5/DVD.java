package Day_5;
public class DVD extends LibraryItem{
    private int duration;
    public DVD(String title, String author, int libID, boolean isCheckedOut, int duration) {
        super(title, author, libID, isCheckedOut); // Calling the parent constructor
        this.duration = duration;

    }
    // Method to show DVD details
    public void showDetails() {
        super.ShowDetails(); // this will Call parent class method
        System.out.println("Duration: " + duration + " minutes");
    }

}
