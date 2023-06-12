import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class GoogleHomePage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Google");
        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false);
        editorPane.setPreferredSize(new Dimension(800, 600));

        try {
            editorPane.setPage(new URL("http://www.google.com"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.getContentPane().add(new JScrollPane(editorPane));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
