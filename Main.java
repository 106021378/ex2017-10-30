import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        if (Math.sqrt(Math.pow(x, 2)) + Math.pow(y, 2) <= 100) {
            System.out.println("inside");

        } else {
            System.out.println("outside");
        }
    }
}