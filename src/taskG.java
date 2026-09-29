import java.util.Scanner;

public class taskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int k = scanner.nextInt();

            if (k == 1 || (k >= 4 && k % 4 == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

