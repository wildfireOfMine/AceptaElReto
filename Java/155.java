import java.util.Scanner;

/**
 *
 * 155 - Perímetro de un Rectángulo - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        while (x >= 0 && y >= 0) {
            System.out.println((x + y) * 2);
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
