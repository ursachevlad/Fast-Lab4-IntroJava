package Tema3;

public class Numarafisare {
    public static void main( String args[] ) {

        int a[] = {134,67,18,10,12,14,23};
        java.util.Arrays.sort(a);

        System.out.println (" Numerele ordonate : ");
        for (int i =0; i < a.length; i ++)
            System.out.println ( a [ i ]);

        int b[] = {12, 23, 31, 34, 45, 89};
        System.out.print( "Se afiseaza numerele asa cum sunt in sir: ");
        for (int i=0; i < b.length; i ++)
            System.out.println( b [ i ]);

    }
}
