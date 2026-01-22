package _6_Test_260122.Ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B_ex1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("간단한 메모장"); // 창 제목

        JPanel panel = new JPanel();


        panel.setBackground(Color.PINK);

        JTextArea textArea = new JTextArea(10, 30);
//        panel.add(textArea);


        JButton saveBtn = new JButton("저장");

        saveBtn.setBackground(Color.darkGray);
        saveBtn.setForeground(Color.WHITE); 


        saveBtn.addActionListener(new ActionListener() { //익명클래스로 구현
            @Override
            public void actionPerformed(ActionEvent e) {
                // 클릭시 동작할 기능 넣기.
                System.out.println(textArea.getText());
            }
        });


        panel.add(new JScrollPane(textArea));
        panel.add(saveBtn);
        frame.add(panel);
        frame.setSize(400, 500); // 창 크기
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을 때 동작 설정
        frame.setVisible(true); // 창 보이기/숨기기
        
    }
}
