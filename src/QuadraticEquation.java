import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for x: ");
        double x = input.nextDouble();
        double y = 3 * Math.pow(x, 2) + 2 * x - 1;
        System.out.println("y = " + y);
    }
}
