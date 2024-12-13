package C02ClassBasic;

public class C0208RecursiveBasic {
    public static void main(String[] args) {

//        // for문으로 1~10까지 누적합계
//        int total = 0;
//        for (int i = 1; i < 11; i++) {
//            total += i;
//        }
//        System.out.println(total);
//        //        재귀함수로 1~10까지 누적합계
//        System.out.println(sumAcc(10));
//
////        팩토리얼(!) 값 구하기
////        5!
//        System.out.println(fac(5));

//        피보나치 수열
//        1 1 2 3 5 8 13 21 34 55
        System.out.println("fibo :"+fibo(10));




        int[] n = new int[10];
        n[0] = 1;
        n[1] = 1;
        for (int i = 2; i <= 10; i++) {
            n[i] = n[i-1] + n[1-2];
        }
        System.out.println(n[9]);
    }

    public static int sumAcc(int n) {
        if (n == 1) {
            return 1;
        }
        System.out.println(n);
        return n + sumAcc(n - 1);

    }

    public static int fibo(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }



    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }

}
