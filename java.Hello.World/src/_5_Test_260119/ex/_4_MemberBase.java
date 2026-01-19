package _5_Test_260119.ex;

public abstract class _4_MemberBase {
    protected String name;
    protected String email;
    protected int age;
    protected String password;

    public _4_MemberBase(String name, String email, int age, String password) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
    }

    public abstract void showInfo(); // 정보 출력용 추상 메서드
}
