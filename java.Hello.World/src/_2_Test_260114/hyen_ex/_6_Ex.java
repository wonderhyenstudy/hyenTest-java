package _2_Test_260114.hyen_ex;

public class _6_Ex {

    public static int getMaxValue(int[] arr) {
        int maxVal = arr[0];
        for (int num : arr){ //arr 배열안에 정수 요소를 순회를 돌면서, 요소를 하나씩 꺼내기
            if (num > maxVal) { // 현재 꺼낸 숫자가 기준값보다 크다면
                maxVal = num; // 기준값을 현재 숫자로 변경
            }
        }

        return maxVal;
    }

    public static void main(String[] args) {
//        3. (메서드 & 최대값 찾기)
//        정수형 배열을 매개변수(파라미터)로 받아,
//        배열 안에 있는 숫자 중 **가장 큰 수(Max Value)**를 찾아
//        반환하는 메서드 getMaxValue를 작성하세요.
//        Main 메서드에서 샘플 배열을 만들어 테스트하세요.
//        String[] numbers = {100,200,300};
//        힌트)
        // 배열의 첫 번째 값을 기준값으로 설정
//        int maxVal = arr[0];
//        if (num > maxVal) { // 현재 꺼낸 숫자가 기준값보다 크다면
//            maxVal = num; // 기준값을 현재 숫자로 변경
//        }

        int[] numbers = {100,200,300};
        int result = getMaxValue(numbers);
        System.out.println("가장 큰 수는 :" + result);



    }
}
