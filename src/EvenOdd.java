import java.awt.*;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("A : ");
        int A = input.nextInt();
        System.out.println("B : ");
        int B = input.nextInt();
        input.close();

        switch (A%2){
            case 0:
                System.out.println("A는 짝수입니다.");
                break;
            case 1:
                System.out.println("A는 홀수입니다.");
        }
        switch (B%2){
            case 0:
                System.out.println("B는 짝수입니다.");
                break;
            case 1:
                System.out.println("B는 홀수입니다.");
        }
    }
}
