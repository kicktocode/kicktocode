package swing;

import javax.swing.*;
import java.awt.*;

public class prac2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AWT COUNTER");
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.setLayout(new FlowLayout());

        JLabel l1 =new JLabel("counter");
        frame.add(l1);
        JTextField t1=new JTextField("100");
        frame.add(t1);
        JButton b1 =new JButton("count");
        frame.add(b1);


    }
}
