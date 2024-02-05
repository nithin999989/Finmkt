package Exceptionhandling;

public class customexception {


    static class CustomException1 extends Exception {
        public CustomException1(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {

            throw new CustomException1("This is a custom exception!");
        } catch (CustomException1 customException) {
            System.out.println("Caught Custom Exception: " + customException.getMessage());
        }
    }
}
