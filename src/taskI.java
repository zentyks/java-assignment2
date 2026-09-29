import java.util.Scanner;

public class taskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        if (a == 0 && b == 0) {
            System.out.println("INF");
        } else if (a == 0 || b * c == a * d) {
            System.out.println("NO");
        } else if (-b % a == 0) {
            long x = -b / a;
            System.out.println(x);
        } else {
            System.out.println("NO");
        }
    }
}
