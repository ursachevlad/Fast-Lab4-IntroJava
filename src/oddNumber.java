import java.util.Scanner;

public class oddNumber {

        public static void main(String args[])
        {
            int x;
            System.out.println("Introdu un numar intreg pentru a vedea daca este par sau impar");
            Scanner in = new Scanner(System.in);
            x = in.nextInt();

            if ( x % 2 == 0 )
                System.out.println("Ati introdus un numar par");
            else
                System.out.println("Ati introdus un numar impar");
        }
    }
