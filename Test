import java.util.Scanner;

public class FibonacciApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int first = input.nextInt();

        System.out.print("Enter how many numbers to generate: ");
        int range = input.nextInt();

        int second = first + 1;

        System.out.print("Fibonacci Sequence: " + first + " " + second);

        for (int i = 2; i < range; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}
