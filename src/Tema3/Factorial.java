package Tema3;

import java.util.Scanner;


public class Factorial {

        public static void main(String args[]) {
            int n, c, fact = 1;

            System.out.println("Introdu un numar pentru a calcula factorialul acestuia: ");
            Scanner in = new Scanner(System.in);

            n = in.nextInt();

            if ( n < 0 )
                System.out.println("Numarul nu ar trebui sa fie negativ");
            else
            {
                for ( c = 1 ; c <= n ; c++ )
                    fact = fact*c;

                System.out.println("Factorial din "+n+" este = "+fact);
            }
        }
}

