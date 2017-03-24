import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureCelsius {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introdu temperatura in Fahrenheit : ");
            double fahrenheit = Double.parseDouble(reader.readLine());
            double celsius = (5.0/9.0)*(fahrenheit - 32);
            System.out.println("Temperatura in Celsius este : "+celsius);
        }
    }
