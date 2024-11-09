import java.util.Objects;

public class Author {
    private String nameAuthor;
     private String surname;

    public Author(String name, String surname) {
        this.nameAuthor = name;
        this.surname = surname;
    }
    public String getName() {
        return this.nameAuthor;
    }
    public String getSurname() {
        return this.surname;
    }
    @Override
        public String toString() {
            return nameAuthor + " " + surname;
        }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a2 = (Author) other;
        return surname.equals(a2.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(surname);
    }
}


