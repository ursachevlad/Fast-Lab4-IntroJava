import java.util.Scanner;

public class CelmaimareNumar {

        public static void main(String args[])
        {
            int x, y, z, k;
            System.out.println("Introdu 4 numere intregi ");
            Scanner in = new Scanner(System.in);

            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();
            k = in.nextInt();

            if ( x > y && x > z && y > k )
                System.out.println("Primul numar este mai mare");
            else if ( y > x && y > z && k > x )
                System.out.println("Al doilea numar este mai mare");
            else if ( z > x && z > y && z > k )
                System.out.println("Al treilea numar este mai mare");
            else if ( k > x && k > y && z > x)
                System.out.println("Al patrulea numar este mai mare");
            else
                System.out.println("Entered numbers are not distinct.");
        }
    }