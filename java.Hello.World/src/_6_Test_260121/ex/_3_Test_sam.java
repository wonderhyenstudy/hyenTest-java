package _6_Test_260121.ex;

import java.util.HashMap;

public class _3_Test_sam {
    public static void main(String[] args) {
//        실습3
//        HashMap (메뉴판 관리)
//
//        다음 요구사항을 만족하는 코드를 작성하세요.

//        1. `HashMap<String, Integer>`를 생성합니다. (변수명: `menuMap`)
        HashMap<String, Integer> menuMap = new HashMap<>();
        //integer : 기초 타입 정수를 -> 객체 타입으로 젼환된 클래스.
//        2. 다음 메뉴와 가격을 추가하세요.
//        * "김밥": 3000
//                * "라면": 4500
//                * "떡볶이": 5000
        menuMap.put("김밥", 3000);
        menuMap.put("라면", 4500);
        menuMap.put("떡볶이", 5000);

//        3. "라면"의 가격을 출력하세요.
        System.out.println("라면의 가격은 : " + menuMap.get("라면"));
//        4. "김밥"의 가격을 **3500원**으로 수정하세요.
        menuMap.put("김밥", 3500);
        System.out.println("김밥의 가격은 : " + menuMap.get("김밥"));
//        5. "돈까스"라는 메뉴가 있는지 확인하고, 결과를 출력하세요.
//        System.out.println("돈까스 메뉴가 있니? " + menuMap.containsKey("돈까스")); // 없으면 false
       if(menuMap.containsKey("돈까스")) {
           System.out.println("돈까스 메뉴가 있어요");   
       } else {
           System.out.println("돈까스 메뉴가 없어요");
       }
//        6. 맵에 들어있는 모든 메뉴 이름(Key)와 값도 같이 출력하세요.
        System.out.println("========= 메뉴판 ==========");
        for (String key : menuMap.keySet()){
            System.out.println(key + " : " + menuMap.get(key));
        }
        System.out.println("=========================");

    }
}
