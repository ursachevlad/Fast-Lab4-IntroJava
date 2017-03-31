package Tema3;

import java.util.Scanner;

public class SumaNumere {

    public static void main(String[] args) {

        System.out.println("Scrie 2 numere. Penru a calcula suma lor scrie 0. ");
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            number = input.nextInt();
            sum+= number;
        }
        while (number !=0);

        System.out.println("Suma este : " + sum);
    }

}