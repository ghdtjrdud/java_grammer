package C04Interface;

public class C0402InterfaceMain implements C0401Interface3, C0401Interface1{
    public static void main(String[] args) {
        C0401Interface3 im = new C0402InterfaceMain();
        im.play("멍멍이", "야옹이");
        im.makeSound();

        C0401Interface1 im2 = new C0402InterfaceMain();
        im2.makeSound();
    }

    @Override
    public void makeSound() {

    }

    @Override
    public String play(String a, String b) {
        return "";
    }
}
