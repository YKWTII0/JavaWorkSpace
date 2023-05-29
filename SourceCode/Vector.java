class Line {
    private double a;
    private double b;

    public Line(double a, double b) {
        if (a == 0) {
            throw new IllegalArgumentException("not be zero.");
        }
        this.a = a;
        this.b = b;
    }

    public double getXIntercept() {
        return -b / a;
    }

    public double getYIntercept() {
        return b;
    }

    public String toString() {
        return "Line equation: y = " + a + "x + " + b;
    }
}

public class Vector {
    public static void main(String[] args){

    }
}

