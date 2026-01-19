package _5_Test_260119;

public class _2_3_Test_interface_SmartPhone_Ex implements _2_3_Test_interface_Phone_Ex, _2_3_Test_interface_Camera_Ex{

    @Override
    public void takePhoto() {
        System.out.println("사진 찍기");
    }

    @Override
    public void makeCall() {
        System.out.println("전화 걸기");
    }
}
