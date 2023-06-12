import java.io.File;

public class ListDirectoryContents {
    public static void main(String[] args) {
        String lectureNoteDirectoryPath = "JavaProgramming/LectureNote";
        String sourceCodeDirectoryPath = "JavaProgramming/SourceCode";

        File lectureNoteDirectory = new File(lectureNoteDirectoryPath);
        File sourceCodeDirectory = new File(sourceCodeDirectoryPath);

        System.out.println("Lecture Note:");
        printDirectoryContents(lectureNoteDirectory);

        System.out.println("\nSource Code:");
        printDirectoryContents(sourceCodeDirectory);
    }

    public static void printDirectoryContents(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("\t" + file.getName());
                } else {
                    System.out.println("\t" + file.getName());
                }
            }
        }
    }
}
