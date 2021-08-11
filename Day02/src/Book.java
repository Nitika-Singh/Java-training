public class Book {
    //has-a relationship
    String title;
    double price;
    Author author;

    void buy(String store) {
        System.out.println("Buying " + title +
                " from " + store);
    }
}
