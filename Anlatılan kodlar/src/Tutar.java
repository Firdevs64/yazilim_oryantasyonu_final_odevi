/* Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı bilgilerini
alın ve sürücünün toplam ne kadar ödemisini gerektiğini hesaplayın.
 */
import java.util.Scanner;
public class Tutar{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Aracınız kilometrede kaç kuruş yakıyor? (Örnek : 0,32) :");
        double kurus = input.nextDouble();
        System.out.print("Aracınızla kaç kilometre gittiniz ? :");
        int km = input.nextInt();
        System.out.println("Toplam ödemeniz gereken tutar : " + (kurus * km) + "tl'dir...");
    }
}