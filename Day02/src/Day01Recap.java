import java.util.Scanner;

public class Day01Recap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] numberArr = new int[size];
        for (int i=0; i<numberArr.length; i++) {
            System.out.println(numberArr[i]);
        }

        int[] collection = {10, 20, 30}; //statically initialized
        char letters[] = new char[10]; //dynamically specifying the size

        //boolean[] switchPositions = {false, true, false, false};
        boolean[] switchPositions = new boolean[5];
        boolean b = false;
        int x = 10;
        increment(x); //pass by value
        System.out.println(x);
    }

    static void increment(int num) {
        num++;
    }
}
