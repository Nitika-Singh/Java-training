public class Day01Recap {
    public static void main(String[] args) {
        int[] collection = {10, 20, 30};
        char letters[] = new char[10];

        int x = 10;
        increment(x); //pass by value
        System.out.println(x);
    }

    static void increment(int num) {
        num++;
    }
}
