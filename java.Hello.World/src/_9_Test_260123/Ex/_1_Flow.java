package _9_Test_260123.Ex;

import javax.swing.*;
import java.awt.*;

public class _1_Flow {
    public static void main(String[] args) {
//        실습1
//        FlowLayout(왼쪽정렬)로
//        JLabel("이름"), JTextField(8글자), JButton("검색")을
//        순서대로 배치하세요.
//        JTextField 입력된 내용을, 검색 버튼을 클릭시, 이벤트 리스너를 이용해서,
//        콘솔에 출력해보기.

        // 컨테이너 생성
        JFrame frame = new JFrame("FlowLayout(왼쪽정렬)");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 40));


        // 방법1. 패널, 프레임에 해당 버튼 삽입
        JLabel label = new JLabel("이름");
        JTextField textField = new JTextField(8);
        JButton btn = new JButton("검색");

        panel.add(label);
        panel.add(textField);
        panel.add(btn);
                
        // 이벤트
        btn.addActionListener(e -> {
            System.out.println(textField.getText());
        });


        // 패널 추가
        frame.add(panel);

        // 기본옵션
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
