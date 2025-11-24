import java.util.Scanner;

public class MostFrequentWord {

    public static void mostFrequentWord() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String mostCommon = "";
        int highestCount = 0;

        // Compare each word with others
        for (int i = 0; i < words.length; i++) {
            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if (count > highestCount) {
                highestCount = count;
                mostCommon = words[i];
            }
        }

        System.out.println(mostCommon + " appeared " + highestCount + " times.");
    }

    public static void main(String[] args) {
        mostFrequentWord();
    }
}
