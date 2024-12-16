package C03Inheritance;

//public class C0305Others extends FinalParents{}
//final 클래스는 상속 불가
public class C0305Others {
    public static void main(String[] args) {
        AbstractDuck d1 = new AbstractDuck();
        d1.makeSound2();
        d1.makeSound1();

//        추상클래스와 인터페이스는 별도의 구현없이 객체생성 불가
//        AbstractAnimal d1 = new AbstractAnimal();
    }
}
//  abstract 메서드가 하나라도 있으면 반드시 클래스에도 abstract 키워드가 붙어야함
abstract class AbstractAnimal {
//    abstract 클래스를 상속받을 때에는 overriding 강제됨
    void makeSound1() {
        System.out.println("동물소리를 냅니다.");
    }
//  리던타입과 매개변수만 있는 메서드 선언만 존재.
   abstract void makeSound2();
}

class AbstractDuck extends AbstractAnimal {

    @Override
    void makeSound2() {
        System.out.println("멍멍");
    }
}



final class FinalParents {

}
