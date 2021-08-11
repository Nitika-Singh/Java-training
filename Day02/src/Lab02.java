import java.util.Arrays;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        int[] inputNumbers = new int[3];
        int[] numbers = new int[3];

        initializeNumbers(inputNumbers, numbers);

        calculateSquare(numbers);
        increment(numbers);
        doubleIt(numbers);

        String outputLabel = getOutputLabel(inputNumbers);
        String outputValues = getOutputValues(numbers);
        System.out.println(outputLabel + " -> " + outputValues);
    }

    static String getOutputValues(int[] numbers) {
        String output = "";
        for(int value : numbers) { //foreach
            output += value + ","; //output = 10, ; output = 10, 20, ; output = 10, 20, 30,
        }
        return output;
    }
    static String getOutputLabel(int[] inputNumbers) {
        String output = "Output of [";
        for (int i = 0; i < inputNumbers.length; i++) {
            int num = inputNumbers[i];
            if(i == inputNumbers.length - 1) {
                output += num + "]";
            } else {
                output += num + ",";
            }
        }
        return output;
    }

    static void initializeNumbers(int[] inputNumbers, int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number I");
        inputNumbers[0] = scanner.nextInt();
        numbers[0] = inputNumbers[0];

        System.out.println("Enter number II");
        inputNumbers[1] = scanner.nextInt();
        numbers[1] = inputNumbers[1];

        System.out.println("Enter number III");
        inputNumbers[2] = scanner.nextInt();
        numbers[2] = inputNumbers[2];
    }

    static void calculateSquare(int[] numbers) {
        System.out.println("****Squaring " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= numbers[i];
        }
    }
    static void increment(int[] numbers) {
        System.out.println("****Incrementing " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
        }
    }
    static void doubleIt(int[] numbers) {
        System.out.println("****Doubling " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
    }

    static void initializeNumbersWithLoop(int[] inputNumbers, int[] numbers, Scanner scanner) {
        for (int i = 0; i < numbers.length; i++) {
            if(i == 0) {
                System.out.println("Enter number I");
                inputNumbers[i] = scanner.nextInt();
            } else if(i == 1) {
                System.out.println("Enter number II");
                inputNumbers[i] = scanner.nextInt();
            } else if(i == 2) {
                System.out.println("Enter number III");
                inputNumbers[i] = scanner.nextInt();
            }
            numbers[i] = inputNumbers[i];
        }
    }

}
