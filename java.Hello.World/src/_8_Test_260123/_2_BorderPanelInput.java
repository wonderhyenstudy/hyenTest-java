package _8_Test_260123;

import javax.swing.*;
import java.awt.*;

public class _2_BorderPanelInput {
    public static void main(String[] args) {
        // 컨테이너 생성
        JFrame frame = new JFrame("입력폼");
        frame.setLayout(new BorderLayout());

        //왼쪽
        JPanel westPanel = new JPanel(new GridLayout(3, 1));
        westPanel.add(new JButton("A"));
        westPanel.add(new JButton("B"));
        westPanel.add(new JButton("C"));

        //가운데
        JPanel centerPanel = new JPanel(new GridLayout(2, 2));
        centerPanel.add(new JLabel("아이디"));
        centerPanel.add(new JTextField(8));
        centerPanel.add(new JLabel("비밀번호"));
        centerPanel.add(new JPasswordField(8));

        frame.add(westPanel, BorderLayout.WEST); //왼쪽
        frame.add(centerPanel, BorderLayout.CENTER); //가운데
        
        //기본 옵션
        frame.setSize(400, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
