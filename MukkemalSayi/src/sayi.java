import java.util.Scanner;
public class sayi {
    public static void main(String[] args) {
        int mukSayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        mukSayi = input.nextInt();

        int say = 0;
        for (int i = 1; i < mukSayi; i++) {
        if (mukSayi % i == 0)
        {
            say += i;
        }
        }
        if (say == mukSayi)
        {
            System.out.println(mukSayi + " Mükemmel sayıdır.");
        }
        else
        {
            System.out.println(mukSayi + " Mükemmel sayı değildir.");

        }
    }
}