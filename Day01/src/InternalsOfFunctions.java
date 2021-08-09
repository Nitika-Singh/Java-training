public class InternalsOfFunctions {
    public static void main(String[] args) {
        int sum = add(12,13); //add(12, 13);
        System.out.println("Sum: " + sum);

        int number = 10;
        System.out.println("***Before calling square() Number is " + number);
        square(number); //Primitive types are passed by VALUE pass-by value
        System.out.println("***After calling square() Number is " + number);
//        void square1() {
//
//        };
        cube(10);

    }

    static int cube(int x) {
        return x * x * x;
    }
    static void square(int x) {
        x = x * x;
    }
    static int add(int a, int b) {
        return a + b;
    }
}
