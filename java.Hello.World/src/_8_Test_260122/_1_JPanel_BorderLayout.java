package _8_Test_260122;

import javax.swing.*;
import java.awt.*;

public class _1_JPanel_BorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Demo");

        // 동,서,남,북,센터
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);

        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
