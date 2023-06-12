import java.io.*;

public class FileMinMax {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("number.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line;
            int minValue = Integer.MAX_VALUE;
            int maxValue = Integer.MIN_VALUE;

            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line);
                minValue = Math.min(minValue, number);
                maxValue = Math.max(maxValue, number);
            }

            br.close();
            fis.close();

            String minString = String.valueOf(minValue);
            String maxString = String.valueOf(maxValue);

            System.out.println("Minimum value: " + minString);
            System.out.println("Maximum value: " + maxString);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in the file.");
        }
    }
}
