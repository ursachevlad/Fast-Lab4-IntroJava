import java.util.Scanner;
import java.lang.*;

public class Average {

        public static void main(String args[])
        {
            int a,b,sum;
            float avg;


            Scanner buf=new Scanner(System.in);

            System.out.print("Introdu primul numar : ");
            a=buf.nextInt();

            System.out.print("Introdu al doilea numar : ");
            b=buf.nextInt();

            /*Calculate sum and average*/
            sum = a+b;
            avg = (float)((a+b)/2);

            System.out.print("Sum : " +sum +"\nAverage : " +avg);

        }
    }

