import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String lastNameAuthor;

    public Author(String nameAuthor, String lastNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getLastNameAuthor() {

        return lastNameAuthor;
    }

    public String toString() {
        return ", Автор - " + getNameAuthor() + " " + getLastNameAuthor();
    }

    public int hashCode(){
        return Objects.hash(getNameAuthor().length());
    }
}
