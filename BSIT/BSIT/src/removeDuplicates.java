import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String text = sc.nextLine();

    // Remove duplicate characters
    String result = "";
    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);
        if (result.indexOf(c) == -1) {
            result += c;
        }
    }

    System.out.println("Result: " + result);

}
}
