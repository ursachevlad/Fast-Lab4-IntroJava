public class maxNumar {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 5;
        int x = (i > j && i > k) ? i : (j > k) ? j : k;
        int y = (i < j && i < k) ? i : (j < k) ? j : k;
        System.out.println("Cel mai mare Numar : "+x);
        System.out.println("Cel mai mic Numar : "+y);
    }
}
