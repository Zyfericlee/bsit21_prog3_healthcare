import java.util.Scanner;

public class TitleCase {

    public static void toTitleCase() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");
        String result = "";

        // Capitalize the first letter of each word
        for (int i = 0; i < words.length; i++) {
            String w = words[i];

            if (w.length() > 0) {
                String first = w.substring(0, 1).toUpperCase();
                String rest = w.substring(1);
                result += first + rest + " ";
            }
        }

        System.out.println("Title Case: " + result.trim());
    }

    public static void main(String[] args) {
        toTitleCase();
    }
}
