import java.util.Scanner;
public class nextTipi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Boşlukla ayrılmış 3 kelime yazınız : ");

        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();

        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        System.out.println("s3 : " + s3);

    }
}