package api;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;

public class DeepDiveArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // create a Array list for cars
        cars.add("Lexus"); // adds car to the list
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Nissan");
        cars.add("Toyota");

        //System.out.println(cars);

        ListIterator it = cars.listIterator(); //iterator prints through list
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }


}
