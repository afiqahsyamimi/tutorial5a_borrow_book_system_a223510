public class Book
{
    private String title;
    private String author;
    private Student borrower;
    
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        borrower = null;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void borrowBy(Student student)
    {
        borrower = student;
    }

    @Override
    public String toString()
    {
        return title + " (" + author + ")";
    }
}
