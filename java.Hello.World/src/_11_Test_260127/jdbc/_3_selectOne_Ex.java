package _11_Test_260127.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static java.sql.DriverManager.getConnection;

public class _3_selectOne_Ex {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("연습용으로 members 테이블에 데이터 1개 조회 예제 확인. ");
        //드라이버 로딩.
        //순서1. 드라이버 로드, 자바 -> 오라클로 쿼리를 전달하기 위한 도구 모음집을 메모리에 로드
        // 연습용으로, 메인 메서드에서 예외를 처리하고
        // 원래는 try catch 구문 작업 하면된다. or try with resources
        // 고정1
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // 실제 조회 기능 사용하기
        searchMember("jdbc@naver.com");
        
    }

    //한명 조회 기능 추가
    public static void searchMember(String email) {
        String sql = "SELECT * FROM members WHERE email = ?";

        // 회원 추가 기능에서, 같은 코드 재사용
        try (
                // 고정2
                Connection conn = getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "scott",
                "tiger"
                );
                PreparedStatement pstmt = conn.prepareStatement(sql)
            ) {

            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) { // 포인터를 다음 행으로 이동, 데이터가 있으면 true
                String name = rs.getString("name");
                String email2 = rs.getString("email");
                String password = rs.getString("password");
                int age = rs.getInt("age");
                System.out.println("검색 결과 -> 이름: " + name + ", 나이: " + age);
                System.out.println("이메일 : " + email2);
                System.out.println("password : " + password);
                // 참고로 try catch finally  는 사용할 도구를 반납해야하는데,
                // 현재는 try with resources 문법을 사용해서, 자동 반납을 한다. (현재 이설정)
            } else {
                System.out.println("해당 이메일의 회원이 없습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
