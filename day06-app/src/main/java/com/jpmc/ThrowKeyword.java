package com.jpmc;

public class ThrowKeyword {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (JPMCTrainingException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        doSomethingCool();
    }

    private static void doSomethingCool()  {
        int[] arr = { 10, 20 };
        try {
            arr[10] = 100;
        }
        catch(Exception ex) {
            String message = ex.getMessage();
            String customMessage = "WTH is this? " + message;
            throw new JPMCTrainingOnFridayException(customMessage);
        }
    }

    private static void doSomething() throws JPMCTrainingException {
        int[] arr = { 10, 20 };
        try {
            arr[10] = 100;
        }
        catch(Exception ex) {
            String message = ex.getMessage();
            String customMessage = "WTH is this? " + message;
            throw new JPMCTrainingException(customMessage);
        }

    }
}

class JPMCTrainingOnFridayException extends RuntimeException { //UncheckedException
    public JPMCTrainingOnFridayException(String message) {
        super(message);
    }
}

class JPMCTrainingException extends Exception { //Checked Exception
    public JPMCTrainingException(String message) {
        super(message);
    }
}