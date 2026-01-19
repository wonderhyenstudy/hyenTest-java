package _5_Test_260119;

public abstract class _3_MemberBase {
    protected String name;
    protected String email;
    protected int age;

    public _3_MemberBase(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public abstract void showInfo(); // 정보 출력용 추상 메서드
}
