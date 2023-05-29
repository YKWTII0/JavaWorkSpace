class TriangleInfo{
    public double getArea(int i, int j){
        return i*j*(0.5);
    }
    public double getArea(double i, double j){
        return i*j*(0.5);
    }
}
public class TriangleOverloading {
    public static void main(String[] args){
        TriangleInfo a = new TriangleInfo();

        double i = a.getArea(1, 2);
        double j = a.getArea(1.2, 5.4);

        System.out.println("삼각형의 넓이 : " + i);
        System.out.println("삼각형의 넓이 : " + j);
    }
}
