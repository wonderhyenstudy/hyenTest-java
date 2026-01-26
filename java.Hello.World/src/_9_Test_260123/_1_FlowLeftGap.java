package _9_Test_260123;

import javax.swing.*;
import java.awt.*;

public class _1_FlowLeftGap {
    public static void main(String[] args) {
        // 컨테이너 생성
        JFrame frame = new JFrame("FlowLayout 왼쪽정렬+간격");
        // 왼쪽 정렬, 수평간격 20px, 수직간격 30px
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 30));

        // 패널, 프레임에 해당 버튼 삽입
        panel.add(new JButton("A"));
        panel.add(new JButton("B"));
        panel.add(new JButton("C"));

        // 패널 추가
        frame.add(panel);

        // 기본옵션
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
