package _5_Test_260119;

public class _1_2_Test_AnimalMain_EX {
    public static void main(String[] args) {

        // 본인타입
        _1_2_Test_Cat_EX cat1 = new _1_2_Test_Cat_EX(); // 업캐스팅
        cat1.sound(); // "야옹~" (오버라이딩된 메소드 호출)

        // 부모타입
        // 작은 타입 -> 큰 타입 : 업 캐스팅
        _1_2_Test_Animal_EX cat2 = new _1_2_Test_Cat_EX();
        cat2.sound();

        // 타입 검사 해보기

        if (cat2 instanceof _1_2_Test_Cat_EX) {
            _1_2_Test_Cat_EX c = (_1_2_Test_Cat_EX) cat2;
            System.out.println("자식 타입입니다.");
        }

    }

}
