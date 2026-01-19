package _5_Test_260119.ex;

public class _3_MemberBasepassword extends _4_MemberBase implements _4_Joinable {

    public _3_MemberBasepassword(String name, String email, int age, String password) {
        super(name, email, age, password);
    }

    @Override
    public void join() {
        System.out.println(name + "님 로그인 성공");
    }
    // 추상 클래스의 , 추상 메서드를 반드시 구현하기.
    @Override
    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("나이 : " + age);
        System.out.println("패스워드 : " + password);
    }
}
