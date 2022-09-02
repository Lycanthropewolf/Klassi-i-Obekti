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

    public boolean equals(Author other) {
        if (other == null) {
            return false;

        } else if (other.getClass() != this.getClass()) {
            return false;

        } else if ((this.getNameAuthor() != other.getNameAuthor()) && (this.getLastNameAuthor() != other.getLastNameAuthor())) {
            return false;


        } else
            return true;
    }

    public int hashCode() {
        return Objects.hash(getNameAuthor().length());
    }
}
