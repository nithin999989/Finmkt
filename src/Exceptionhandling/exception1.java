package Exceptionhandling;

public class exception1 {

    public static void main(String[] args) {
        try {

            int result = 10 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception: " + ae.getMessage());
        }

        try {

            int[] myArray = {1, 2, 3};
            int element = myArray[5];
        } catch (IndexOutOfBoundsException x) {
            System.out.println("Index Out-of-Bounds Exception: " + x.getMessage());
        }

        try {

            recursiveFunction();
        } catch (StackOverflowError y) {
            System.out.println("Stack Overflow Exception: " + y.getMessage());
        }
        finally{
            System.out.println("This is exception handling");
        }
    }

    private static void recursiveFunction() {
        recursiveFunction();
    }
}
