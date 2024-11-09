import java.util.Objects;

public class Book {
    private  String name;
    private  Author author;
    private int publicationDate;

    public Book(String name, Author author, int publicationDate) {
        this.name = name;
        this.author = author;
        this.publicationDate = publicationDate;
    }
    public String getName() {
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublicationDate() {
        return this.publicationDate;
    }
    public void setPublicationDate (int publicationDate) {
        this.publicationDate = publicationDate;
    }
    @Override
    public String toString() {
        return name + " " + author + " " + publicationDate;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return name.equals(b2.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
