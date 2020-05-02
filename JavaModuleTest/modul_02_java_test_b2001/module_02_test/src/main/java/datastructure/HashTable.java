package datastructure;
import java.util.Hashtable;

public class HashTable {

    /**
     * SHow your understanding on HashTable
     * Use some methods from HashTable Class
     * */
    public static void main(String[] args) {


    Hashtable<String, String> students = new Hashtable<String, String>();
    students.put("Ferhan", "QA");
    students.put("Navid", "QA");


    System.out.println(students);
    System.out.println(students.isEmpty());

    }
}
