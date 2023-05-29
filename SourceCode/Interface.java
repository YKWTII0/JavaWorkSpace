abstract class Device2 {
    String modelName;
    String companyName;
    int birthYear;
    abstract public void showModel();
    abstract public void showCompany();
    public int getYear() {
        return birthYear;
    }
}
interface Internet {
    public static final int delay = 10;
    public abstract void Connect();
    public abstract void Disconnect();
}
class Tablet extends Device2 implements Internet {
    public Tablet(String model, String company, int year) {
        modelName = model;
        companyName = company;
        birthYear = year;
    }
    public void showModel() {
        System.out.println("모델 : " + modelName);
    }
    public void showCompany() {
        System.out.println("제조사 : " + companyName);
    }
    public void Connect() {
        System.out.println("연결");
    }
    public void Disconnect() {
        System.out.println("연결X");
    }
}
public class Interface {
    public static void main(String[] args) {
        Tablet tablet = new Tablet("iPad pro", "APPLE", 2023);
        tablet.showModel();
        tablet.showCompany();
        tablet.Connect();
        tablet.Disconnect();
    }
}