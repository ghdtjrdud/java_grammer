package C03Inheritance;

public class C0304ProtectedTest {
    public static void main(String[] args) {
        C0304ProtectedClass p1 = new C0304ProtectedClass();

//        public 변수 접근가능
        System.out.println(p1.st4);
//        protected 변수 접근가능(같은 패키지 이므로)
        System.out.println(p1.st3);
        System.out.println(p1.st2);

//        System.out.println(p1.st1);   private 변수는 같은 클래스내에서만 접근 가능
    }
}
