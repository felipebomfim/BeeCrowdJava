import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        sum += 2 * scanner.nextDouble();
        sum += 3 * scanner.nextDouble();
        sum += 5 * scanner.nextDouble();
        System.out.printf("MEDIA = %.1f\n", sum / 10);
        scanner.close();
    }
}
