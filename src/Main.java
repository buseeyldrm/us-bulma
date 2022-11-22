import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı girin: ");
        int n= klavye.nextInt();
        System.out.print("Üs sayıyı girin: ");
        int m= klavye.nextInt();
        int cevap=1;

        for (int i = 1; i <=m ; i++) {
            cevap*=n;

        }
        System.out.println("Cevap: " +cevap);
    }
}