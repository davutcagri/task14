import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Permütasyon Hesabı");
        System.out.print("Eleman sayısı: ");
        int eleman = scanner.nextInt();
        System.out.print("Seçim sayısı: ");
        int secim = scanner.nextInt();
        System.out.println("Permütasyon sonucu: " + permutasyon(eleman, secim));
    }

    public static int permutasyon(int a, int b) {
        if (a > 1) {
            return (faktoriyel(a) / faktoriyel(a - b));
        } else {
            return 1;
        }
    }

    public static int faktoriyel(int c) {
        if (c > 1) {
            return (c * (faktoriyel(c - 1)));
        } else {
            return 1;
        }
    }
}