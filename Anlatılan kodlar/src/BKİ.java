// Beden kitle indeksi : Kilo / Boy(m) * Boy(m)
import java.util.Scanner;
public class BKİ{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu girin: ");
        int kilo = input.nextInt();
        System.out.print("Boyunuzu girin : (Örnek : 1,72)");
        double boy = input.nextDouble();
        double bki = kilo / (boy * boy);
        System.out.println("Beden kitle indeksiniz: " + bki);
    }
}