package _5_Test_260120.ex_20260120;

public class _3_NormalMember extends _3_MemberBase implements _3_Joinable {
    // 매개변수가 3개인 생성자
//    public _3_NormalMember(String name, String email, int age) {
//        super(name,email,age);
//    }

    // 매개변수가 4개인 생성자 : 비밀번호 추가작업
    public _3_NormalMember(String name, String email, String password, int age) {
        super(name, email, password, age);
    }

    // Joinable 인터페이스의 메서드를 재정의,
    @Override
    public void join() {
        System.out.println(name + "님 회원가입 완료.");
    }
    // 추상 클래스의 , 추상 메서드를 반드시 구현하기.
    @Override
    public void showInfo() {
        System.out.println("이름 : " +name);
        System.out.println("이메일 : " +email);
        System.out.println("나이 : " +age);
    }
}
