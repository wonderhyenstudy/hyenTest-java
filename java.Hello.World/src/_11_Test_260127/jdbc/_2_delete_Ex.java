package _11_Test_260127.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import static java.sql.DriverManager.getConnection;

public class _2_delete_Ex {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("연습용으로 members 테이블에 데이터 삭제 예제 확인. ");
        //드라이버 로딩.
        //순서1. 드라이버 로드, 자바 -> 오라클로 쿼리를 전달하기 위한 도구 모음집을 메모리에 로드
        // 고정1
        Class.forName("oracle.jdbc.driver.OracleDriver");

        //삭제
        deleteMember("jdbc33@naver.com");
    }
    public static void deleteMember(String email) {
        String sql = "DELETE FROM members WHERE email = ?";

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

            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("회원 삭제 완료: " + email);
            } else {
                System.out.println("삭제할 회원이 존재하지 않습니다.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
