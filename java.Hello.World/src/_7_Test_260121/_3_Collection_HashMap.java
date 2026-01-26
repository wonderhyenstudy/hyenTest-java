package _7_Test_260121;

import java.util.HashMap;

public class _3_Collection_HashMap {
    public static void main(String[] args) {
        //생성
        HashMap<String, Integer> map = new HashMap<>();

        //추가
        map.put("user1", 90 );
        map.put("user2", 85);
        map.put("user3", 100);

        //조회
        // 해당 키로 검색해서, 값을 출력한다.
        System.out.println("하나 조회 : " + map.get("user1"));

        //수정
        //키가 이미 존재하면, 값을 덮어씀
        map.put("user2", 90);
        System.out.println("수정 후 조회 : " + map.get("user2"));

        //삭제
        map.remove("user2");
        System.out.println("삭제 후 조회 : " + map.get("user2"));

        //키로 검색
        boolean haskey =  map.containsKey("user1");
        System.out.println(haskey); // 있으면 true
        System.out.println(map.containsKey("user1")); // 있으면 true

        //값으로 검색
        boolean hasValue =  map.containsValue(100);
        System.out.println(hasValue); // 있으면 true

        //전체조회
        //방법1. 키들만 뽑아서, 전제 조회, 가장 많이 사용
        System.out.println("===========");
        for (String key : map.keySet()){
            System.out.println(", " + key + ", " +  map.get(key));
        }
        //방법2. 값들만 뽑아서 반복
        for (int num : map.values()){
            System.out.println(num);
        }

    }
}
