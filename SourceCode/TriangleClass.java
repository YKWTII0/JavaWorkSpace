import java.util.Scanner;
public class TriangleClass {
    int width;
    int height;
    public double getArea(){
        Scanner inputValue = new Scanner(System.in);
        System.out.println("밑변 : ");
        width = inputValue.nextInt();
        System.out.println("높이 : ");
        height = inputValue.nextInt();
        inputValue.close();
        double result = (width * height) / 2.0;
        return result;
    }
    public static void main(String[] args){
        TriangleClass Area = new TriangleClass(); // 객체 생성
        System.out.println("삼각형의 넓이 : " + Area.getArea());
    }
}
