package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {

        Anagram p1 = new Anagram();
        p1.isAnagram("Marc", "Army");


    }
    public void isAnagram(String input1, String input2){
        String s1 = input1.replaceAll("\\s", "");
        String s2 = input2.replaceAll("\\s", "");

        boolean status = true;

        if (s1.length() != s2.length()) {
            status = false;

        } else {

            char[]s1Array = s1.toLowerCase().toCharArray();
            char[]s2Array = s2.toLowerCase().toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            status = Arrays.equals(s1Array, s2Array);
        }

        if (status) {
            System.out.println("They are anagrams");
        } else {
            System.out.println("They are not anagrams");
        }
    }
}



