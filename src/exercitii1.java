/**
 * Created by MyPc on 18.03.2017.
 */
public class exercitii1 {

    public static void main(String[] args) {

        int numar;
        numar=SkeletonJava.readIntGUI( "Introduceti un numar");

        if(numar>=0) {
            // calculeaza si afiseaza patratul sau
            int patrat = numar*numar;
            SkeletonJava.printGUI("Aici este patratul: " +patrat);
        }

        else {
            // aici se va afisa asa cum l-am citit

            SkeletonJava.printGUI("Aici este numarul:" +numar);
        }
    }

}
