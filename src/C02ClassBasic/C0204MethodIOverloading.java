package C02ClassBasic;

public class C0204MethodIOverloading {
    public static void main(String[] args) {

        C0204MethodIOverloading c1 = new C0204MethodIOverloading();
        System.out.println(c1.sum(10, 20));
        System.out.println(c1.sum(10, 20, 30));
        System.out.println(c1.sum(10.2, 20.2));


    }
//    접근제어자를 안붙이면 기본적으로 default 접근제어자 : 같은 패키지내에서만 접근가능

    int sum(int a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }

//    같은 이름이라도 매개변수의 타입또는 개수가 다르기때문에 가능(메서드 오버로딩)
    double sum(double a, double b) {
        return a+ b;
    }


}
