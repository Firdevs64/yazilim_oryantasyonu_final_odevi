import java.util.Scanner;
public class LogaritmaHesabı {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("a ve b sayılarını giriniz : ");
        int a = input.nextInt();
        int b = input.nextInt();

        double sonuc = Math.log10(b) / Math.log10(a);
        System.out.println("sonuc : " + sonuc);
    }
}