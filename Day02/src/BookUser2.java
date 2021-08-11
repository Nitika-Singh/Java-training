public class BookUser2 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Programming Scala";
        b1.price = 34.56;
        b1.author.firstName = "V"; //?

        Author author = new Author();
        author.firstName = "Venkat";
        author.lastName = "Subramaniam";

        b1.author = author;

        System.out.println(b1.title);
        System.out.println(b1.price);
        System.out.println(b1.author.firstName);
        System.out.println(b1.author.lastName);
    }
}
