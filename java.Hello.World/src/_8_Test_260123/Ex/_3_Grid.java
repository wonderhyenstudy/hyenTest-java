package _8_Test_260123.Ex;

import javax.swing.*;
import java.awt.*;

public class _3_Grid {
    public static void main(String[] args) {
//        실습3
//        3x2 GridLayout, 각 칸에 번갈아
//        JLabel("항목")과 JTextField(5글자)를 배치해서
//        3행 폼을 만들어보세요.

        JFrame frame = new JFrame("3x2 GridLayout");
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        for (int i = 0; i < 3 ; i++) {
            panel.add(new JLabel("항목" + i));
            panel.add(new JTextField("입력" + + i, 5));
        }

//        panel.add(new JLabel("항목1"));
//        panel.add(new JTextField("입력1", 5));
//
//        panel.add(new JLabel("항목2"));
//        panel.add(new JTextField("입력2", 5));
//
//        panel.add(new JLabel("항목3"));
//        panel.add(new JTextField("입력3", 5));


        frame.add(panel);

        frame.setSize(200, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
