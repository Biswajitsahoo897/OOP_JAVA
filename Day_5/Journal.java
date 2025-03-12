package Day_5;

public class Journal extends LibraryItem {
    private String publicationDate;
    private int volume;
    public Journal(String Author,String title ,int libID,boolean isCheckedOut,String publicationDate,int volume){
        super( Author,title,libID,isCheckedOut);
        this.volume=volume;
        this.publicationDate=publicationDate;
    }
    public void showDetails() {
        super.ShowDetails(); // this will Call parent class method
        System.out.println("Publication date: " + publicationDate + "\n Volume"+volume);
    }
}
