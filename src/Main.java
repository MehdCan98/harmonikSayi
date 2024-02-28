import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        int sayi;
        double sonuc =0.0;

        System.out.println("Değer Yazınız: ");
        sayi =input.nextInt();

        for (int i =1; i<=sayi; i++){

            sonuc+=(1/i);
        }
        System.out.println(sonuc);
    }
}