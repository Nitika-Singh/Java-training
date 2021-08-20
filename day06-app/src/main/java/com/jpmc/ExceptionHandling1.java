package com.jpmc;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        //When JVM encounters an error, it gets all the info about that Error and constructs an object
        //Populates that object with all the information
        //Gives the object to your program
        //If you have written code to handle it, no problem
        //Otherwise JVM throws it on your face and stops the program

        int[] arr = {10, 20};
//        try {
//            arr[10] = 1000;
//            String str = null;
//            str.split(",");
//            System.out.println("End of try");
//        }
//        catch(ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Array index error: " + ex.getMessage());
//        }
//        catch(NullPointerException ex) {
//            System.out.println("NPE: " + ex.getMessage());
//        }
//        catch(Exception ex) {
//            System.out.println("ERROR: " + ex.getMessage() + ", " + ex.getClass().getName());
//        }

        try {
            arr[10] = 1000;
            String str = null;
            str.split(",");
            System.out.println("End of try");
        }
        catch(ArrayIndexOutOfBoundsException | NullPointerException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        catch(Exception ex) {
            System.out.println("Strange error: " + ex.getMessage());
        }
        System.out.println("End of main");
    }
}
