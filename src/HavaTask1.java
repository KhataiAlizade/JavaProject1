public class HavaTask1 {
    public static void main(String[] args) {
        System.out.println("Starting the program...");
        System.out.println("Hello World");
        System.out.println("Debugging starts here...");

        int result = addNumbers(5, 7);

        System.out.println("Result of adding numbers: " + result);
        System.out.println("End of the program.");
    }

    public static int addNumbers(int a, int b) {
        System.out.println("Adding numbers: " + a + " and " + b);
        return a + b;
    }
}
