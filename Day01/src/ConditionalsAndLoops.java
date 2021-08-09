public class ConditionalsAndLoops {
    public static void main(String[] args) {
        //if-else
        int number = 10;
        if(number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else if(number % 2 != 0) {
            System.out.println(number +" is an odd number");
        } else {
            System.out.println("I don't know what number is this!!!");
        }

        //Prior to java 12, switch-case is not really preferred
        switch (number % 2) {
            case 0:
                System.out.println(number + " is an even number");
                break;
            case 1:
                System.out.println(number + " is an odd number");
                break;
            default:
                System.out.println("I don't know!!!");
        }

        //Syntax is very similar to C, JS, C#
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }
        int count = 0;
        while(count < 5) {
            System.out.println("Monday blues");
            count++;
        }
        int counter = 0;
        do {
            System.out.println("This week sucks");
            counter++;
        } while (counter < 5);

    }
}
