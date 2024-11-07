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
        public String toString() {
            return nameAuthor + " " + surname;
        }
    }


