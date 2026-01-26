package _8_Test_260122.Ex;

import javax.swing.*;

public class A_ex1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("오늘의 점심"); // 창 제목
        frame.setSize(500, 500); // 창 크기
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을 때 동작 설정
        frame.setVisible(true); // 창 보이기/숨기기


        JLabel labelFrame = new JLabel("메뉴를 고르시오");
        frame.add(labelFrame);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setSize(200, 100); // 창 크기
        panel.setVisible(true); // 창 보이기/숨기기

        // 창에 버튼을 바로 붙였다
        JButton button = new JButton("웁스! 버튼");
        JButton button2 = new JButton("웁스! 버튼2");
        panel.add(button);
        panel.add(button2);

        // 라벨 추가
        JLabel label = new JLabel("하하. 라벨");
        panel.add(label);

//        버튼, 라벨을 패널에 추가하기
//        panel.add(button);
//
//        JPanel panel = new JPanel(); 추가 해주고,
//        panel 을 프레임(창) 에 추가하고,
//
//        frame.add(panel);


    }
}
