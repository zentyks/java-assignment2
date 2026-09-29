import java.util.Scanner;

public class taskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        long cost = a * 100 + b;
        long paid = c * 100 + d;
        long change = paid - cost;

        long e = change / 100;
        long f = change % 100;

        System.out.println(e + " " + f);
    }
}