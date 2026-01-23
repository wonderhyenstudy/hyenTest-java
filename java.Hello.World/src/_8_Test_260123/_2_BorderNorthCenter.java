package _8_Test_260123;

import javax.swing.*;
import java.awt.*;

public class _2_BorderNorthCenter {
    public static void main(String[] args) {
        //컨테이너 생성
        JFrame frame = new JFrame("BorderLayout 일부영역");
        frame.setLayout(new BorderLayout());

        //버튼 삽입. 위치 및 속성 바로 지정
        frame.add(new JLabel("제목", SwingConstants.CENTER), BorderLayout.NORTH);
        frame.add(new JTextArea(5, 20), BorderLayout.CENTER);

        //기본옵션
        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
