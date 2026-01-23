package _8_Test_260123.Ex;

import javax.swing.*;
import java.awt.*;

public class _2_Border {
    public static void main(String[] args) {
        // 실습2
        // BorderLayout의 각 영역(NORTH, SOUTH, EAST, WEST, CENTER)에
        // 모두 다른 컴포넌트(버튼, 라벨, 텍스트필드 등)를 배치해보세요.
        // - 북 : 라벨 , 헤더
        // - 남 : 버튼, 확인
        // - 동 : 텍스트필드 , 입력
        // - 서 : JCheckBox , 선택
        // - 중앙 : JTextArea(4,12) 정도,
        // 크기 , 가로 350, 높이 180
        // 기본옵션 사용.

        // 북동서남 : NORTH EAST SOUTH WEST

        // 컨테이너 생성
        JFrame frame = new JFrame("입력폼");
        frame.setLayout(new BorderLayout());


        // 방법1 : 변수로 저장해서 변수로 넣기
        // 컴포넌트 생성
//        JLabel label = new JLabel("라벨");
//        JButton btn = new JButton("버튼");
//        JTextField textField = new JTextField("입력",10);
//        JCheckBox checkBox = new JCheckBox("체크박스");
//        JTextArea textArea = new JTextArea(4,12);

        // 큰틀 짜기
        // 컴포넌트 넣기
        // 넣으면서 위치를 잡는다
//        frame.add(label, BorderLayout.NORTH);
//        frame.add(btn, BorderLayout.WEST);
//        frame.add(textField, BorderLayout.EAST);
//        frame.add(checkBox, BorderLayout.SOUTH);
//        frame.add(textArea, BorderLayout.CENTER);

        // 방법2 : 간단하게 직접 대입
        frame.add(new JLabel("라벨"), BorderLayout.NORTH);
        frame.add(new JButton("버튼"), BorderLayout.WEST);
        frame.add(new JTextField("입력",10), BorderLayout.EAST);
        frame.add(new JCheckBox("체크박스"), BorderLayout.SOUTH);
        frame.add(new JTextArea(4,12), BorderLayout.CENTER);



        //기본 옵션
        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);




    }
}
