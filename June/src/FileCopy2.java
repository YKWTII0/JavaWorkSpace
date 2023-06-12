import java.io.*;

public class FileCopy2 {
    public static void main(String[] args) {
        String sourceFilePath = "input.txt";
        String destinationFilePath = "output.txt";

        try {
            FileInputStream fis = new FileInputStream(sourceFilePath);
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream(destinationFilePath);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            bis.close();
            fis.close();

            bos.close();
            fos.close();

            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found.");
        } catch (IOException e) {
            System.out.println("Error reading or writing the file.");
        }
    }
}
