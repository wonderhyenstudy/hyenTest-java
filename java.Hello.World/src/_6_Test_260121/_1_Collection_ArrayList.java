package _6_Test_260121;

import java.util.ArrayList;

public class _1_Collection_ArrayList {
    public static void main(String[] args) {
        // ArrayList<담을 데이터 타입> 변수명 = new ArrayList<>();
        // <> : 다이어모든 연산자
        //      "제너릭" 이라 부름. 어떤 타입으로 배열의 구성 요소를 지정할지 정함.
        ArrayList<String> list = new ArrayList<>();
        // 추가 : list.add(추가할데이터, 데이터 타입에 맞는 조건);
        list.add("사과");
        list.add("바나나");
        list.add("딸기");
        // 조회 : list.get(해당 인덱스 번호) : 해당 인덱스 번호 위치의 값을 불러옴
        System.out.println(list.get(0)); // "사과"
        System.out.println(list.get(1)); // "바나나"
        System.out.println(list.get(2)); // "딸기"
        // 수정 : list.set(수정할 인덱스 번호,수정할 데이터);
        list.set(0,"포도로 수정");
        System.out.println(list.get(0)); // "포도로 수정"
        //삭제
        list.remove(2);
//        System.out.println(list.get(2)); // 2번 삭제 후 조회

        //전체삭제
        list.clear();
//        System.out.println(list.get(0)); // 전체삭제 후 조회

        //리스트가 비어 있는지 여부 확인.
        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty); // true면 비어 있다는 것

        //전체 출력 방법. 향상된 for 문 이용.
        list.add("사과");
        list.add("바나나");
        list.add("딸기");
        for (String fruit : list) {
            System.out.println("향상된 for문으로 불러오기 : " + fruit);
        }

        //검색
        //방법1. contains() 이용
        // 검색어를 받아서 검색 : 검색어가 있는지 여부 확인
        //list.contains("검색어")
        boolean check = list.contains("사과");
        System.out.println("검색방법1 : " + check); // true면 검색어가 있다는 것

        // 방법2,
        // indexOf() : 앞에서부터 검색 / lastIndexOf() : 뒤에서부터 검색
        // : 데이터가 몇번째 있는지 확인.
        int appleIndex = list.indexOf("사과");
        int berryIndex = list.lastIndexOf("딸기");
        System.out.println("appleIndex의 위치 : " + appleIndex);
        System.out.println("berryIndex 위치 : " + berryIndex);

        //방법3
        //반복문을 이용한 조건 검색. 커스텀 검색
        //"사" 로 시작하는 단어 찾기
        String foundFruit = null;
        for (String fruit : list){
            if (fruit.startsWith("사")){
                foundFruit = fruit;
                break;
            }
        }
        System.out.println("사 로 시작하는 단어 : " + foundFruit);











    }
}
