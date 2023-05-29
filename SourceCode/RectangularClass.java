import java.util.Scanner;
class Rectangular{
    private int width;
    private int height;
    public Rectangular() {
        this.width = 0;
        this.height = 0;
    }
    public Rectangular(int x, int y) {
        this.width = x;
        this.height = y;
    }
    public int getArea(int width, int height){ return width*height; }
    public void square(int width, int height){
        if(width==height)
            System.out.println("정사각형입니다.");
        else
            System.out.println("직사각형입니다.");
    }
    public double diagonal(int width, int height){
        return Math.sqrt(width*width + height*height);
    }
}
public class RectangularClass {
    public static void main(String[] args){
        Scanner inputValue = new Scanner(System.in);
        System.out.println("가로 : ");
        int width = inputValue.nextInt();
        System.out.println("세로 : ");
        int height = inputValue.nextInt();
        inputValue.close();

        Rectangular AREA = new Rectangular();
        Rectangular SQUARE = new Rectangular();
        Rectangular DIAGONAL = new Rectangular();

        System.out.println("면적 : " + AREA.getArea(width,height));
        SQUARE.square(width,height);
        System.out.println("대각선의 길이 : " + DIAGONAL.diagonal(width,height));
    }
}
