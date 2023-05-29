import java.util.Scanner;

class Coordinate {
    private int x;
    private int y;

    public Coordinate() {
        this.x = 0;
        this.y = 0;
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printInfo() {
        System.out.println("Coordinate: (" + this.x + ", " + this.y + ")");
    }

    public double distanceTo(Coordinate other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class PointClass {
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        System.out.println("x: ");
        int x = inputValue.nextInt();
        System.out.println("y: ");
        int y = inputValue.nextInt();
        inputValue.close();

        Coordinate p1 = new Coordinate(x, y);
        Coordinate p2 = new Coordinate(10, 10);
        p1.printInfo();
        p2.printInfo();

        double distance = p1.distanceTo(p2);

        System.out.println("Length from a point :" + distance);
    }
}
