package _8_Test_260123;

import javax.swing.*;

public class _4_NullLayoutBtn {
    public static void main(String[] args) {
        JFrame frame = new JFrame("좌표 배치");
        frame.setLayout(null);

        JButton btn = new JButton("버튼");

        btn.setBounds(60, 40, 100, 30);

        frame.add(btn);

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
