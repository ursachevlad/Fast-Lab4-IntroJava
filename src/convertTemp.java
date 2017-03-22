import java.util.*;

public class convertTemp {

        public static void main(String[] args) {
            float temperatue;
            Scanner in = new Scanner(System.in);

            System.out.println("Introdu temperatura in Fahrenheit");
            temperatue = in.nextInt();

            temperatue = ((temperatue - 32)*5)/9;

            System.out.println("Temperatura in Celsius este de = " + temperatue);
        }
    }



