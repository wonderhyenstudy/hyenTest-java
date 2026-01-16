package _4_Test_260116.hyen_ex;

public class _0_Ex {
    public static void main(String[] args) {

        // 1. 변수 정의하는 방법
        // [데이터타입] [변수명] = [값];
        // 변수 선언과 동시에 초기 값 설정.
        int age = 25;
        String name = "홍길동";
        double height = 175.5;
        // 값을 안 넣어도 된다. 공간만 확보한다.
        int student;
        String menu;

        // 2. 변수 사용하는 방법
        // 변수명을 호출하여 값을 읽거나 수정합니다.
        System.out.println(name + "님의 나이는 " + age + "세입니다.");
        age = 26; // 값 업데이트


        // 3. 배열 정의하는 방법
        // [타입][] [배열명] = {초기값들}; 또는 new [타입][크기];
        String[] fruits = {"사과", "바나나", "포도"}; // 선언과 동시에 초기화
        int[] scores = new int[5]; // 크기가 5인 빈 배열 생성


        // 4. 배열 사용하는 방법
        // 인덱스(0부터 시작)를 사용하여 접근합니다.
        System.out.println("첫 번째 과일: " + fruits[0]);
        fruits[1] = "망고"; // 값 변경

        // 배열의 길이를 확인하며 반복문 사용
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }


        // 5. 클래스에서 메서드 사용하는 방법
        // 1) 클래스 인객체(Instance) 생성
        // 2) 참조변수.메서드명() 형태로 호출
        Calculator calc = new Calculator(); // 인스턴스 생성
        int result = calc.add(10, 20);      // 메서드 호출
        System.out.println("합계: " + result);





    }
    static class Calculator {
        int num1;
        int num2;
        public int add (int num1, int num2) {
            int sum = num1 + num2;
            return sum;
        }


    }
}
