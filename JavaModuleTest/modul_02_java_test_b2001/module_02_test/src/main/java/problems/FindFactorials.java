package problems;

public class FindFactorials {

   // 5 * 4 *3 *2 * 1

    public static void main(String[] args) {
        int i;
        int Factorial = 1;
        int Roof = 5;

        for(i = 1; i<= Roof; i++) {
            Factorial = Factorial*i;
        }
        System.out.println(Factorial);
    }
}
