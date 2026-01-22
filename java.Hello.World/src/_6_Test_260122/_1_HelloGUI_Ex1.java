package _6_Test_260122;

import javax.swing.*;

public class _1_HelloGUI_Ex1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello GUI"); // 창 제목

        // 창에 버튼을 바로 붙였다
        JButton button = new JButton("Click Me!");
        frame.add(button);

        // 라벨 추가
        JLabel label = new JLabel("Hello, Swing!");
        frame.add(label);

        frame.setSize(300, 200); // 창 크기
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을 때 동작 설정
        frame.setVisible(true); // 창 보이기/숨기기
    }
}
