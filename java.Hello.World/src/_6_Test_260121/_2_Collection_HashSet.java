package _6_Test_260121;

import java.util.HashSet;

public class _2_Collection_HashSet {
    public static void main(String[] args) {
        //HashSet 중복이 없다
        //생성
        HashSet<Integer> set = new HashSet<>();

        //추가
        set.add(10);
        set.add(20);
        set.add(30);

        //중복 안되는 부분 확인. 중복되어서 추가 안했음.
        boolean isAdded = set.add(10);
        System.out.println("10 중복 추가 여부 확인 : " + isAdded); //추가 안되어 false

        //수정
        //리스트 달라서, 삭제 후 추가해야함
        set.remove(10);
        set.add(100);

        //삭제
        set.remove(20);


        //전체조회
        System.out.println("=====전체조회=====");
        for (int num : set){
            System.out.println("남은 숫자는 : " + num);
        }

        // 조회 및 검색. 하나 조회
        // set은 순서가 없음. 특정 하나 선택 어려움. 왜??? set.get(0) 가져올수 없음.
        // 왜?? 순서 index 정보가 없음
        // 크기만 조회
        System.out.println("크기 조회 : " + set.size());

        System.out.println("100 있는지 여부 확인 : " + set.contains(100));


        //중복 안되는 부분 확인. 중복되어서 추가 안했음.
        boolean isAdded2 = set.add(100);
        System.out.println("100 중복 추가 여부 확인 : " + isAdded2); //추가 안되어 false



    }
}
