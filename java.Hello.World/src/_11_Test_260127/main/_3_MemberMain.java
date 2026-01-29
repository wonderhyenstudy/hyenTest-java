package _11_Test_260127.main;

import _11_Test_260127.service._3_MemberService;
import _11_Test_260127.ui._3_MemberUI;

import javax.swing.*;

public class _3_MemberMain {
    public static void main(String[] args) {

        // 스윙의 기능이용해서, 스래드 이요하기
        // [GUI 변경] 메인 스레드에서 GUI 실행,


        SwingUtilities.invokeLater(() -> {
            // 기능 구현 클래스(서비스) 생성
            _3_MemberService service = new _3_MemberService();

            // 화면 클래스(ui) 생성 및 서비스 주입
            new _3_MemberUI(service);

        });


    }
}
