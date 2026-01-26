package _6_Test_260120.ex_20260120;

public abstract class _3_MemberBase {
    protected String name;
    protected String email;
    protected String password;
    protected int age;

    public _3_MemberBase(String name, String email, String password, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

//    public _3_MemberBase(String name, String email, int age) {
//        this.name = name;
//        this.email = email;
//        this.age = age;
//    }

    public abstract void showInfo(); // 정보 출력용 추상 메서드

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
