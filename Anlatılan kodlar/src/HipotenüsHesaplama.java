// Dik üçgenin hipotenüsünü bulma
import java.util.Scanner;
public class HipotenüsHesaplama{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Birinci kenar : ");
        a = input.nextInt();
        System.out.print("İkinci kenar : ");
        b = input.nextInt();

        double h = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenüs : " + h);
    }
}