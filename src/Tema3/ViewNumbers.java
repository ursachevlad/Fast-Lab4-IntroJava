package Tema3;

import java.util.Scanner;

public class ViewNumbers {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int num = 0;
        System.out.println("Introduceti numere. Apasati 0 si treceti in etapa urmatoare. ");
        while(true){
            //get user input
            num = Integer.parseInt(reader.nextLine());
            if(num == 0){
                System.out.println("Ati trecut in etapa urmatoare!");
                break;
            }
        }
    }

}