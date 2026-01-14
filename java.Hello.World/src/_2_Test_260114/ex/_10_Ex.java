package _2_Test_260114.ex;

public class _10_Ex {
// - 배열에서, 가장 긴 문자열을 반환하는 메서드를 생성합니다.
// 순서1
// 함수 정의? O, 호출?X
    public static String getLongest(String[] words) {
// 샘플 배열 생성.
// 5 6 4
// String[] words = {"apple", "banana", "kiwi"};
// 배치. 배열의 길이를 이용하면. 배열. length()
// 순서2, 가장 긴 문자열을 임시로 담을 변수 선언.
        String longest = "";
// 순서3,
// - 반복문을 이용해서, 배열 안에 들어 있는 문자열 중에서 가장 긴 문자열 찾아서
        for(String word: words) { // words 배열안에 문자열 요소를 순회를 돌면서, 요소를 하나씩 꺼내기
            if(word.length() > longest.length()) {
// 시도1, word:"apple", longest : "", 5 > 0 , true , longest : "apple"
// 시도2, word:"banana", longest : "apple", 6 > 5 , true , longest : "banana"
// 시도3, word:"kiwi", longest : "banana", 4 > 6 , false , longest : "banana"
                longest = word;
            } // if 닫는 부분
        } // for 닫는 부분
// 순서4, 반복문이 끝나면 반환하기
        return longest; // 메서드가 반환하는 문자열 의미.
    } // getLongest 메서드 닫는 부분

    public static void main(String[] args) {
//        3)
//        문자열 배열을 메서드로 받아 가장 긴 문자열을 반환
//        힌트)
//        - 배열을 반환하는 메서드를 생성합니다.
//        public static String 메서드명(String[] 배열이름)
//        - 반복문을 이용해서, 배열 안에 들어 있는 문자열 중에서 가장 긴 문자열 찾아서
//        배치. 배열의 길이를 이용하면. 배열. length()


    }
}
