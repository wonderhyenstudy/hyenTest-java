package _5_Test_260119.ex;

public class _2_Ex_AnimalMain {
    public static void main(String[] args) {
        // 1) Animal 클래스 부모 타입으로 배열 = aniList 을 생성함.
        // 2) Animal 클래스를 상속 받은 자식 클래스 : Dog, Cat,
        //    aniList 배열에, 요소로, Dog 타입도,Cat 타입도, Animal 타입도 요소를 담기.
        // 3) 반복문을 이용하고, instanceof를 이용해서,
        //    각 타입을 확인 후, 각 타입에 맞는 내용을 호출하기.
        //    Animal[] aniList = new Animal[3];
        //    Animal[] aniList = {new Dog(), new Cat(), Animal()};

//        _2_Ex_Animal animal = new _2_Ex_Animal();

        _2_Ex_Animal[] aniList = {new _2_Ex_Dog(), new _2_Ex_Cat(), new _2_Ex_Animal()};

        for (_2_Ex_Animal animal : aniList) {
            if (animal  instanceof _2_Ex_Dog) {
                _2_Ex_Dog dog = (_2_Ex_Dog) animal;
                dog.sound();
            } else if(animal  instanceof _2_Ex_Cat) {
                _2_Ex_Cat cat = (_2_Ex_Cat) animal;
                cat.sound();
            } else {
                animal.sound();
            }
        }



    }

}
