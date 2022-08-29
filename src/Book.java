public class Book {
    private  String name;
    private  Author author;
    private int yearIssue;

    public Book(String name, Author author, int yearIssue) {
        this.name = name;
        this.author = author;
        this.yearIssue = yearIssue;

    }

    public String getName() {
        return this.name;
    }
    public Author getAuthor(){return this.author;}

    public int getYearIssue() {
        return this.yearIssue;
    }
    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }





}
