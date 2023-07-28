package swing;
import javax.swing.*;
import java.awt.*;

public class framePrac {
    public static void main(String[] args) {
        JFrame j =new JFrame("Dialogue box");
        j.setVisible(true);
        j.setSize(800,400);
        j.setLayout(new FlowLayout());

        JLabel l1=new JLabel("username :");
        j.add(l1);
        JTextField T1=new JTextField(20);
        j.add(T1);

        JLabel l2=new JLabel("password :");
        j.add(l2);
        JTextField T2=new JTextField(20);
        j.add(T2);

        JButton button =  new JButton("submit");
        j.add(button);




    }
}
