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
    public int publishingYear() {
        return this.publicationDate;
    }
    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }
}