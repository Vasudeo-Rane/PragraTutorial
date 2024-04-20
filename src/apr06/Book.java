package apr06;

public class Book {
    String author;
    int publicationYear;
    String genre;
    String nameOfTheBook;
    double price = 49.99;

    Book(String author, int publicationYear, String genre, String nameOfTheBook, double price) {
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.nameOfTheBook = nameOfTheBook;
        this.price = price;
    }

    Book(String author, int publicationYear, String genre, String nameOfTheBook) {
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.nameOfTheBook = nameOfTheBook;
    }

    public void displayObjectVarible() {
        System.out.println("Author is " + author + ", Publication year is " + publicationYear + ", Genre is " + genre + " ,Name of the book is " + nameOfTheBook + " , Price of the book is " + price);
    }

}
