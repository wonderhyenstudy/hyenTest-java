package _9_Test_260123;

import javax.swing.*;
import java.awt.*;

public class _1_FlowWrap {
    public static void main(String[] args) {
        // 컨테이너 생성
        JFrame frame = new JFrame("FlowLayout 줄바꿈");
        JPanel panel = new JPanel(new FlowLayout());

        // 버튼 삽입
        for (int i = 1; i <= 6; i++) {
            panel.add(new JButton("버튼" + i));
        }

        // 패널 추가
        frame.add(panel);

        //기본옵션
        frame.setSize(250, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
