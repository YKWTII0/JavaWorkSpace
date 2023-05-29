class Triangle{
    int width;
    int height;
    public Triangle(){
        width = 1;
        height = 1;
    }
    public Triangle(int i){
        this.width = i+1;
        this.height = i+1;
    }
    public double getArea(){
        double result = (width * height) / 2.0;
        return result;
    }
}
public class TriangleClassArray {
    public static void main(String[] args){
        Triangle[] t; // 배열 선언
        t = new Triangle[5];

        for (int i = 0; i < t.length; i++)
            t[i] = new Triangle(i);

        System.out.println("면적 출력");
        for (int i = 0; i < t.length; i++)
            System.out.print((double)(t[i].getArea()) + " ");
    }
}
