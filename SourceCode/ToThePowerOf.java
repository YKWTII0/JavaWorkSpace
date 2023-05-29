import java.util.Scanner;

public class ToThePowerOf {
    public static void DoubleLoop(){
        Scanner inputValue = new Scanner(System.in);
        System.out.println("a : ");
        int a = inputValue.nextInt();
        System.out.println("b : ");
        int b = inputValue.nextInt();
        inputValue.close();

        for (int i=0; i<a; i++){ // 이중 반복문을 이용하여 제곱하기
            int result = 1;
            for (int j=0; j<b; j++){
                result = result*(i+1);
            }
            System.out.println((i+1)+" to the power of "+b+" : "+result);
        }
    }
    public static void main(String[] args){
        DoubleLoop();
    }
}
