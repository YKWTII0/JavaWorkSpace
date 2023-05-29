import java.awt.desktop.SystemEventListener;
import java.util.Scanner; // 만들어져 있는 class를 사용하겠다는 뜻
// System.in : standard input stream
// System.out : standard output stream
public class CompareIntegers2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer : ");
        int num1 = input.nextInt();
        System.out.println("Enter the second integer : ");
        int num2 = input.nextInt();

        if (num1 == num2){
            System.out.println("같다");
        }
        else if (num1 > num2){
            System.out.println("첫번째 숫자가 크다");
        }
        else if (num1 < num2){
            System.out.println("두번쨰 숫자가 크다");
        }
    }
}
