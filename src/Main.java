import java.util.Scanner;
// System.in : standard input stream
// System.out : standard output stream
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner object
        System.out.print("x값 입력 : ");
        double x = input.nextDouble();

        double y = 3 * Math.pow(x, 2) + 2 * x - 1;
        System.out.println("y값 : " + y);
    }
}