import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Programming");

        JLabel usernameLabel = new JLabel("ID");
        JLabel passwordLabel = new JLabel("PW");

        JTextField usernameTextField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        usernameTextField.setColumns(10);
        passwordField.setColumns(10);

        JButton loginButton = new JButton("로그인");

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                if (username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password!");
                }

                usernameTextField.setText("");
                passwordField.setText("");
            }
        });

        frame.getContentPane().add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
