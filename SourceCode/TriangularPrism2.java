import java.util.Scanner;

class TriangleClass4 {
    protected int side;

    public TriangleClass4() {
        side = 1;
    }

    public TriangleClass4(int side) {
        this.side = side;
    }

    protected double getArea() {
        double area = side * side * (Math.sqrt(3)/4);
        return area;
    }
}

public class TriangularPrism2 extends TriangleClass4 {
    private double prism_height;

    public TriangularPrism2() {
        super();
        side = 1;
        prism_height = 1;
    }

    public TriangularPrism2(int side, int prism_height) {
        super(side);
        this.side = side;
        this.prism_height = prism_height;
    }

    public double getArea() {
        double Area = getArea() * 2 + (side*prism_height) * 4;
        return Area;
    }
    public double getVolume() {
        double surfaceArea = getArea() * prism_height;
        return surfaceArea;
    }

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("한 변의 길이 : ");
        int side = inputValue.nextInt();
        System.out.println("삼각기둥의 높이 : ");
        int prism_height = inputValue.nextInt();

        TriangularPrism2 prism = new TriangularPrism2(side, prism_height);
        System.out.println("삼각형의 겉넓이 : " + prism.getArea());
        System.out.println("삼각기둥의 부피 : " + prism.getVolume());

        inputValue.close();
    }
}
