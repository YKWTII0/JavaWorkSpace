import java.util.Scanner;

class TriangleClass3 {
    private int width;
    private int height;

    public TriangleClass3() {
        width = 1;
        height = 1;
    }

    public TriangleClass3(int width, int height) {
        this.width = width;
        this.height = height;
    }

    protected double getArea() {
        double area = (width * height) / 2.0;
        return area;
    }
}

public class TriangularPrism extends TriangleClass3 {
    private double prism_height;

    public TriangularPrism() {
        super();
        prism_height = 1;
    }

    public TriangularPrism(int width, int height, int prism_height) {
        super(width, height);
        this.prism_height = prism_height;
    }

    public double getVolume() {
        double volume = (super.getArea() * prism_height);
        return volume;
    }

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("밑변 : ");
        int width = inputValue.nextInt();
        System.out.println("높이 : ");
        int height = inputValue.nextInt();
        System.out.println("삼각기둥의 높이 : ");
        int prism_height = inputValue.nextInt();

        TriangularPrism prism = new TriangularPrism(width, height, prism_height);
        System.out.println("삼각형의 넓이 : " + prism.getArea());
        System.out.println("삼각기둥의 부피 : " + prism.getVolume());

        inputValue.close();
    }
}
