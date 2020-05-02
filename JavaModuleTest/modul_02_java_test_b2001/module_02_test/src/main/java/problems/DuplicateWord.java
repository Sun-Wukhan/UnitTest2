package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {

        String testSring = "Welcome to Java Java Session Session Session";

        String[] words = testSring.split(" ");
        int wordCount = 1;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    wordCount = wordCount + 1;
                    words[j] = "0";
                }
            }
            if (words[i] != "0")
                System.out.println(words[i] + "--" + wordCount); //Printing the word along with count
            wordCount = 1;

        }
    }
}

