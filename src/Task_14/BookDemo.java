package Task_14;

public class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
        myBook.title = "Funny jokes";
        System.out.println("Book modified title = " + myBook.getTitle() + "; old name was \"" + bookTitle + "\"");
    }

}
