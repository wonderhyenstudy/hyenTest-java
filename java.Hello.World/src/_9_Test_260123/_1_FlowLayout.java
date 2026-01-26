package _9_Test_260123;

import javax.swing.*;
import java.awt.*;

public class _1_FlowLayout {
    public static void main(String[] args) {
        // ### 예시 1: 기본 FlowLayout (가운데 정렬)


        // 컨테이너 생성
        JFrame frame = new JFrame("FlowLayout 기본");
        JPanel panel = new JPanel(new FlowLayout());
        
        // 패널. 프레임에 해당 버튼을 붙이는 작업

        JButton eventBtn = new JButton("이벤트 버튼");
        panel.add(new JButton("하나"));
        panel.add(new JButton("둘"));
        panel.add(new JButton("셋"));
        panel.add(eventBtn);

        // 패널 추가
        frame.add(panel);

        //이벤트
        eventBtn.addActionListener(e -> {
            System.out.println("이벤트 버튼 액션(트리거) 동작 확인.");
        });

//        eventBtn.addActionListener(e -> {
//            System.out.println("이벤트 버튼 액션(트리거) 동작 확인. ");
//        });


        // 기본옵션
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
