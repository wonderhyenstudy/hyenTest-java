package _9_Test_260123;

import javax.swing.*;
import java.awt.*;

public class _3_Grid2x2 {
    public static void main(String[] args) {
        //컨테이너 생성
        JFrame frame = new JFrame("2x2 Grid");
        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 20));


        panel.add(new JButton("A"));
        panel.add(new JButton("B"));
        panel.add(new JButton("C"));
        panel.add(new JButton("D"));

        frame.add(panel);

        frame.setSize(200, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
