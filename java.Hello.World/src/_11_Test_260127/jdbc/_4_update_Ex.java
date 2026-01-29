package _11_Test_260127.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import static java.sql.DriverManager.getConnection;

public class _4_update_Ex {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("연습용으로 members 테이블에 데이터 수정 예제 확인. ");
        //드라이버 로딩.
        //순서1. 드라이버 로드, 자바 -> 오라클로 쿼리를 전달하기 위한 도구 모음집을 메모리에 로드
        // 고정1
        Class.forName("oracle.jdbc.driver.OracleDriver");

        //수정해보기
        // 변경전 ("이상용jdbc","jdbc@naver.com","1234",20)
        // 변경후 ("이상용jdbc2","jdbc@naver.com","1234",20)
        updateMember("이상용jdbc2","jdbc@naver.com","1234",20);


    }

    public static void updateMember(String name, String email, String password, int age) {
    // 이메일(PK 역할)을 기준으로 이름, 비밀번호, 나이를 수정한다고 가정
        String sql = "UPDATE members SET name = ?, password = ?, age = ? WHERE email = ?";

        try (
                // 고정2
                Connection conn = getConnection(
                        "jdbc:oracle:thin:@localhost:1521:xe",
                        "scott",
                        "tiger"
                );
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {

            // SQL문의 ? 순서에 맞춰 값 설정
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, password);
            pstmt.setInt(4, age); // WHERE절의 이메일

            int result = pstmt.executeUpdate(); // 변경된 행의 개수 반환

            if (result > 0) {
                System.out.println("회원 정보 수정 완료!");
            } else {
                System.out.println("수정할 회원을 찾지 못했습니다. (이메일 확인 필요)");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
