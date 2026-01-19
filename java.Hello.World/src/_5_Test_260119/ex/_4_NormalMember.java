package _5_Test_260119.ex;

public class _4_NormalMember extends _4_MemberBase implements _4_Joinable {

    public _4_NormalMember(String name, String email, int age, String password) {
        super(name, email, age, password);
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
