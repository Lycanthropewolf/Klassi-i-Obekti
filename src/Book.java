public class Book {
    private String name;
    private int yearIssue;

    public Book(String name, int yearIssue) {
        this.name = name;
        this.yearIssue = yearIssue;
    }

    public String getName() {
        return this.name;
    }

    public int getYearIssue() {
        return this.yearIssue;
    }
    public void setYearIssue(int yearIssue) {
        this.yearIssue=yearIssue;
    }
}
