package _6_Test_260121.ex;

import java.util.HashSet;

public class _2_Test_sam {
    public static void main(String[] args) {
//        실습2
//        다음 요구사항을 만족하는 코드를 작성하세요.
//
//        1. `HashSet<Integer>`를 생성합니다. (변수명: `lottoSet`)
        HashSet<Integer> lottoSet = new HashSet<>();
//        2. 다음 숫자들을 순서대로 추가하세요:
        lottoSet.add(5);
        lottoSet.add(12);
        lottoSet.add(5); //중복
        lottoSet.add(20);
        lottoSet.add(12); //중복
        lottoSet.add(7);
        // 6개 중에 2개 중복

//`       5, 12, 5, 20, 12, 7` (중복된 숫자가 있음)
//        3. 현재 `lottoSet`의 **크기(개수)**를 출력하여
//        중복이 제거되었는지 확인하세요.
        System.out.println("lottoSet`의 기(개수) : " + lottoSet.size());

//        4. 숫자 `20`을 삭제하세요.
        lottoSet.remove(20);
        System.out.println("lottoSet`의 기(개수) : " + lottoSet.size());

//        5. 숫자 `5`가 세트 안에 포함되어 있는지(`true/false`) 확인하여 출력하세요.
        System.out.println("5가 포함되어 있니? " + lottoSet.contains(5));

//        boolean isAdded = lottoSet.add(5); // 중복이 안됨.
//        System.out.println("숫자 5가 있니 ? " + isAdded); // 있어서 중복이 안되어서 false
//        6. 전체 숫자를 반복문(향상된 for문)으로 출력하세요.
        for (int num : lottoSet){
            System.out.println("남은 숫자" + num);
        }




    }
}
