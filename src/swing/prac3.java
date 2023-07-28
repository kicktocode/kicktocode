package swing;

import javax.swing.*;
import java.awt.*;

public class prac3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AWT Counter");
        frame.setLayout(new GridLayout(3, 2));
        frame.setVisible(true);
        frame.setSize(400, 400);

        JPanel panel1 = new JPanel(new FlowLayout(SwingConstants.LEADING));
        frame.add(panel1);

        JLabel label = new JLabel("Enter value of n:");
        panel1.add(label);

        JTextField field = new JTextField(20);
        panel1.add(field);

        JLabel label2 = new JLabel("Factorial (n)");
        panel1.add(label2);

        JTextField field2 = new JTextField(20);
        panel1.add(field2);

        JButton button = new JButton("Next");
        panel1.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
