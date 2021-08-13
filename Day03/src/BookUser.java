public class BookUser {
    public static void main(String[] args) {
//        Book b1 = new Book(); //calling a special function
//        b1.title = "Outliers";
//        b1.price = 23.45;
//        System.out.println(b1.title + ", " + b1.price);

        Book b1 = new Book("Outliers", 23.45);
        System.out.println(b1.title + ", " + b1.price);
        //b1.Book();
    }
}
