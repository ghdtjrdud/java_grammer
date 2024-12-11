package C02ClassBasic;

public class C0201MethodPractice {
    public static void main(String[] args) {

        if (isPrime(13)) {
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }

    }
    public static boolean isPrime(int a) {
        int count = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            return false;
        } else {
            return true;
        }
    }

}
