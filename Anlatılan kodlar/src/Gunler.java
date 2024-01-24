import java.util.Scanner;
public class Gunler {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Gün için bir sayı giriniz (1-7) : ");
        int gun = input.nextInt();

        switch (gun){
            case 1 :
                System.out.println("Bugün Pazartesi");
                break;
            case 2 :
                System.out.println("Bugün Salı");
                break;
            case 3 :
                System.out.println("Bugün Çarşamba");
                break;
            case 4 :
                System.out.println("Bugün Perşembe");
                break;
            case 5 :
                System.out.println("Bugün Cuma");
                break;
            case 6 :
                System.out.println("Bugün Cumartesi");
                break;
            case 7 :
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Lütfen geçerli bir sayı giriniz : ");
                System.exit(1);
        }
    }
}