package _8_Test_260123.Ex;

import javax.swing.*;
import java.awt.*;

public class _4_setLayoutNull2 {
    public static void main(String[] args) {
//        실습 4
//        setLayout (null)로
//        "이름", "나이" 라벨과 입력란, "확인" 버튼을 각각
//        좌표 X,Y : (15,15), (15,50), (70,15), (70,50), (110,90)에
//        크기 (50, 25) 가로 50, 100, 세로 25/30 크기로 배치하세요.

        JFrame frame = new JFrame("패널 좌표배치");
        frame.setLayout(null);


        JLabel name = new JLabel("이름");
        name.setBounds(10,10,50,30);

        JLabel age = new JLabel("나이");
        age.setBounds(70,10,100,30);

        JButton searchBtn = new JButton("확인");
        searchBtn.setBounds(180,10,100,30);

        frame.add(name);
        frame.add(age);
        frame.add(searchBtn);


        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
