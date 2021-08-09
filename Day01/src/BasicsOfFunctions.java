public class BasicsOfFunctions {
    public static void main(String[] args) {
        printInfo();
        int randomNumber = generateRandomNumber();
        System.out.println(randomNumber);
        hello("Sam");
        hello("Mary");
        hi("Virat", "Kohli");
    }
    static void hi(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName);
    }
    static void hello(String name) {
        System.out.println("Hello " + name);
    }
    static void printInfo() {
        System.out.println("Printing info");
    }
    static int generateRandomNumber() {
        int num = (int)(Math.random() * 100);
        return num;
    }

}
