public class Main {
  public static void main(String[] args) {
    Author author = new Author("Лев","Толстой");
    Book book = new Book("Война и мир", author, 1865);
    Author author2 = new Author("Александр", "Пушкин");
     Book book2 = new Book("Евгений Онегин", author2, 1825);
     book2.setPublicationDate(1866);
  }
}