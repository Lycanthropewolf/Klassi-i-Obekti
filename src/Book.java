import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearIssue;

    public Book(String name, Author author, int yearIssue) {
        this.name = name;
        this.author = author;
        this.yearIssue = yearIssue;

    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearIssue() {

        return yearIssue;
    }

    public String toString() {
        return " Название книги - " + getName() + ", Год издания - " + getYearIssue() + getAuthor();
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }

    public boolean equals(Book other) {
        if (other == null) {
            return false;

        } else if (other.getClass() != this.getClass()) {
            return false;

        } else if ((this.getName() != other.getName()) && (this.getAuthor() != other.getAuthor()) && (this.getYearIssue() != other.getYearIssue())) {
            return false;


        }else
        return true;
    }

    public int hashCode(){
        return Objects.hash(getYearIssue());
    }



}
