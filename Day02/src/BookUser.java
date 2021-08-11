public class BookUser {
    public static void main(String[] args) {
        Book b = null;
        if(b != null) {
            System.out.println(b.title); //NullPointerException
        }



        //b1 is a reference to a Book object
        //b1 is a handle to Book object
        //b1 is an instance of Book class
        //Book is instantiated to a new object and b1 is the reference
        Book b1 = new Book();
        b1.title = "Hacking";
        b1.price = 23.45;
        b1.buy("Amazon");

        Book b2 = new Book();

        b1 = b2;
        System.out.println(b1.title);

    }
}
