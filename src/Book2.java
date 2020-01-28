//represents a bok. Used as derived class
public class Book2
{
    public int pages;
    //sets up book with the specified number of pages.
    public Book2(int numPages)
    {
        pages = numPages;
    }
    //prints message about pages of this book
    public void pageMessage()
    {
        System.out.println("Number of pages: " + pages);
    }
}//end of book class
