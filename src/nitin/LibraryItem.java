package nitin;

public class LibraryItem {
    protected String itemId;
    protected String issueNumber;


    public void checkOut(){
        System.out.println("chekout");
    }

    public void Return(){
        System.out.println("item is returned");
    }

}
