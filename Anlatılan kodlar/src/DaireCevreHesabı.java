import java.util.Scanner;
public class DaireCevreHesabı{
    public static void main(String[] args){
        final double PI_DEGERİ = 3.141593;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yarıçap değerini giriniz : ");
        double yaricap = input.nextDouble();
        double cevre = 2 * PI_DEGERİ * yaricap;
        System.out.println(yaricap + " yarıçaplı dairenin çevresi : " + cevre + " dır.");
    }
}