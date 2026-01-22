package _6_Test_260122.Ex;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A_ex1_sam {
    public static void main(String[] args) {
        JFrame frame = new JFrame("오늘의 점심"); // 창 제목

        JPanel panel = new JPanel();
        JLabel label = new JLabel("오늘 점심 메뉴는 : ㅎㅎ");

        JButton button = new JButton("메뉴");
        JButton exitBtn = new JButton("나가기");

        JLabel nameLabel = new JLabel("이름 입력 : ");
        JTextField nameTextField = new JTextField(10);


        frame.add(panel);
        panel.add(label);
        panel.add(button);
        panel.add(exitBtn);
        exitBtn.addActionListener(new ActionListener() { //익명클래스로 구현
            @Override
            public void actionPerformed(ActionEvent e) {
                // 클릭시 동작할 기능 넣기.
                frame.dispose();//나가기
            }
        });
        panel.add(nameLabel);
        panel.add(nameTextField);





        frame.setSize(500, 500); // 창 크기
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을 때 동작 설정
        frame.setVisible(true); // 창 보이기/숨기기

    }
}
