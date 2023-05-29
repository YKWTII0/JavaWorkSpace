abstract class Device {
    String modelName;
    String companyName;
    int birthYear;
    public abstract String getModelName(String modelName);
    public abstract String getCompanyName(String companyName);
    public int Year(int birthYear) { return birthYear; }
}
class Computer extends Device {
    public String getModelName(String modelName){
        return modelName;
    }
    public String getCompanyName(String companyName){
        return companyName;
    }
}

public class AbstractClass {
    public static void main(String[] args){
        Device device = new Device() {
            @Override
            public String getModelName(String modelName) {
                return null;
            }

            @Override
            public String getCompanyName(String companyName) {
                return null;
            }
        };
    }
}