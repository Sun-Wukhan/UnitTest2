package api;

public class StringAPI {

    /**
     * @author Jahiudl Islam
     * Read String JDK 8 API documantation to be read and String source code to be viewed
     * Demonastrate your understanding on String after reading the documentation
     * You are free to document your understanding using comment
     * Reason to comment is to keep documentation so that next developer can get highlevel understaning of your implementation
     * by reading your comments/documents
     *
     * */

    public static void main(String[] args) {
        String beta = "Try this";
        String alpha = "Do Not";

        System.out.println(beta.compareTo(alpha));
        System.out.println(beta.charAt(3));
        System.out.println(beta.contains("g"));
        System.out.println(beta.length());
        System.out.println(beta.indexOf(5));

        char data[] = {'a','b', 'c'};
        String language = new String(data);
        System.out.println(language);
    }
}
