package apr06;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("JimCollins", 2023, "Non fiction", "Good to great", 20.99);
        book1.displayObjectVarible();
        Book book2 = new Book("Rober kiyoski", 2014, "Non fiction", "Rich Dad Poor Dad");
        book2.displayObjectVarible();
    }
}
