import java.util.Scanner;

class Coordinate2 {
    private int x;
    private int y;

    public Coordinate2() {
        this.x = 0;
        this.y = 0;
    }

    public Coordinate2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printInfo() {
        System.out.printf("(%d, %d)\n", this.x, this.y);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

class Line {
    private Coordinate2 start;
    private Coordinate2 end;

    public Line(Coordinate2 start, Coordinate2 end) {
        this.start = start;
        this.end = end;
    }

    public Line(int startX, int startY, int endX, int endY) {
        this.start = new Coordinate2(startX, startY);
        this.end = new Coordinate2(endX, endY);
    }

    public double getLength() {
        double dx = this.start.getX() - this.end.getX();
        double dy = this.start.getY() - this.end.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Coordinate2 getMidpoint() {
        int midX = (this.start.getX() + this.end.getX()) / 2;
        int midY = (this.start.getY() + this.end.getY()) / 2;
        return new Coordinate2(midX, midY);
    }

    public void printCoordinates() {
        System.out.println("Start point:");
        this.start.printInfo();
        System.out.println("End point:");
        this.end.printInfo();
    }
}


public class PointClass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter start point x:");
        int startX = input.nextInt();
        System.out.println("Enter start point y:");
        int startY = input.nextInt();
        System.out.println("Enter end point x:");
        int endX = input.nextInt();
        System.out.println("Enter end point y:");
        int endY = input.nextInt();

        input.close();

        Line line = new Line(startX, startY, endX, endY);
        line.printCoordinates();
        System.out.printf("Length of line: %.2f\n", line.getLength());
        System.out.println("Midpoint of line:");
        line.getMidpoint().printInfo();
    }
}
