package _3_Test_260115;

public class _1_Test_try_catch_EX {

    public static class ThrowExample {
        public static void main(String[] args) throws Exception {
            throw new Exception("직접 예외 발생");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("///////////// 1. try 구간 : 조건 및 문제 던짐");
            int result = 10 / 0; // 실패하는 예시
//            int result = 10 / 2; // 성공하는 예시
        } catch (ArithmeticException e) { // 작은 범위 처리.
        // 현재는 뭐가 문제인지를 여부를 정확히 알고 있으니, 작은 범위로 처리.
        // 뭐가 문제가 모를 경우, 1) 각각을 세부적으로 모두 정의 2) 큰 범위로 정의
            System.out.println("///////////// 2. catch 구간 : 받고 예외면 출력");
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("///////////// 3. finally 구간 : 예외와 상관업이 출력");
            System.out.println("예외발생과 상관없이 무조건 실행");
        }







    }
}
