import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFilePath = "input.txt";
        String destinationFilePath = "output.txt";

        try {
            FileInputStream fis = new FileInputStream(sourceFilePath);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            FileOutputStream fos = new FileOutputStream(destinationFilePath);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            br.close();
            isr.close();
            fis.close();

            bw.close();
            osw.close();
            fos.close();

            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found.");
        } catch (IOException e) {
            System.out.println("Error reading or writing the file.");
        }
    }
}
