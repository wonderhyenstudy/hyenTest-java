package _5_Test_260119.ex;

// _3_2_Ex_Playable 상속 받아서 play() 재정의
public class _3_2_Ex_MusicPlayer implements _3_2_Ex_Playable {

    @Override
    public void play() {
        System.out.println("소리를 켜요");
    }
}
