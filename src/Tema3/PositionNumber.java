package Tema3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;

public class PositionNumber {

    public static void main(String[] args) throws IOException {

        // definim variabilele

        boolean isPresent=false;
        Integer index=null;

        int aarray[]={12, 21, 32, 6, 43, 2};
        System.out.println("Introdu numarul pe care doresti sa il cauti: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        // citeste,ia input-ul de la consola

        String input;
        switch (input = br.readLine()) {
        }
        // putem folosi si o excptie String input=br.readLine()
        Integer number=Integer.valueOf(input);
        // va converti numarul in input


        // comparam fiecare element pe care il introducem cu cele pe care le avem in array
        // pentru asta folosim un loop cu for
        for(int i=0;i<aarray.length;i++) {
            if (aarray[i]==number) {
                isPresent=true;
                index=i;
            }

        }

        // scriem conditia cu if, daca punem un numar din array il gasim si devine true
        // daca nu gasim numarul primim mesaj
        if(isPresent==true) {
            System.out.println("Numarul se gaseste la pozitia ="+index);
        }
           else{
            System.out.println(" -1 ");
        }


    }
}
