package api;
import java.util.HashMap;

public class MapAPI {

    public static void main(String[] args) {

        HashMap<String, String> carMeet = new HashMap<String, String>();
        carMeet.put("Navid", "Lexus");
        carMeet.put("Ferhan", "Cadillac");
        carMeet.put("Michael", "Ferrari");
        carMeet.put("Shawn", "Lamborghini");

        System.out.println(carMeet);
    }
}
