import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //System.out.println(Math.random() * 100);
        int target = (int)(Math.random() * 100);
        int attempts = 0;
        String message = "";
        boolean isGameOver = false;
        int guess = -1; //Some initial value
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the guessing game. Enter a number between 1 and 100");

        while(!isGameOver) {
            guess = scanner.nextInt();
            attempts++;
            if (guess > target) {
                message = "Aim lower";
            } else if(guess < target) {
                message = "Aim Higher";
            } else {
                message = "You've got it in " + attempts + " attempts";
                isGameOver = true;
            }
            System.out.println(message);
        }
    }
}
