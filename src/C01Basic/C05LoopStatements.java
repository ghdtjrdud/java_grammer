package C01Basic;

public class C05LoopStatements {
    public static void main(String[] args) {
//        int a = 0;
//        while (a < 10) {
//            System.out.println("hello world");
//            a++;
//        }

//        2~10까지 출력하는 while문 예제
//        int a = 2;
//        while (a <= 10) {
//            System.out.println(a);
//            a++;
//        }

//      입력한 숫자의 구구단 단수 출력
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            int i = 1;
//            while (i < 10) {
//                System.out.println(a + " * " + i + " = " + a*i);
//                i++;
//            }
//        }

//        도어락키예제 : 무한반복
//        int answer = 1234;
//        int a = 0;
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            if (answer == input){
//                System.out.println("문이 열렸습니다.");
//                break;  // break 는 가장 가까이에 있는 반복문을 종료
//
//            }else {
//                System.out.println("비밀번호가 틀렸습니다.");
//
//            }
//            a++;
//            if (a == 5) {
//                System.out.println("5회 이상 초과");
//                break;
//            }
//
//        }

//        do while문 : 무조건 1번은 실행되는 while문
//            int a = 100;
//        do {
//            System.out.println(a);
//        } while (a<10);

//        for : 초기식, 조건식, 증감식이 모두 포함되어있는 반복문
//        int b = 2;
//        while (b < 11) {
//            System.out.println(b);
//            b++;
//        }
//        for (int a = 2; a < 11; a++) {
//            System.out.println(a);
//        }
//         for문은 사용했던 변수명을 for문 끝난이후 다음 라인에서 재선언이 가능

//        1~10 중에 홀수만 출력하기

//        for (int i = 1; i < 11 ; i++) {
//            if ((i % 2) != 0) {
//                System.out.println(i);
//            }
//        }
//
////        1~20까지 수 중에 짝수를 모두 더한 값
//        int count = 0;
//        for (int i = 1; i < 21; i++) {
//            if ((i % 2) == 0) {
//                count = count + i;
//            }
//        }
//        System.out.println(count);

//        두수의 최대 공약수 찾기
//        int a = 24;
//        int b = 36;
//        int max = 0;
//        for (int i = 1; i < a; i++) {
//            if ((a % i) == 0 && (b % i) == 0) {
//                max = i;
//            }
//        }
//        System.out.println(max);

//        사용자가 입력한 숫자 n이 소수인지 아닌지 판별
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if ((n % i) == 0) {
//                count ++;
//            }
//        }
//        if (count > 2) {
//            System.out.println("소수가아닙니다.");
//        } else {
//            System.out.println("소수입니다");
//        }

//          continue : 반복문의 조건식으로 이동
//        for (int i = 0; i < 11; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        배열과 향상된 for 문( for each문)
//        int[] arr = {1, 3, 5, 7};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        일반 for문으로 배열 접근
//        for (int i = 0; i < 4; i++) {
//            System.out.println(arr[i]);
//        }
//
////        향상된 for문으로 배열 접근 : a에 arr의 값이 하나씩 담기고, 값의 갯수만큼 반복횟수가 결정
//        for (int a : arr) {
//            System.out.println(a);
//        }

//        일반 for문을 통해 arr의 저장된 값 변경
//        for (int i = 0; i < 4; i++) {
//            arr[i] += 10;
//            System.out.println(arr[i]);
//        }
//
////        향상된 for문을 통해 arr의 값 변경 시도
//        for (int a : arr) {
//            a+= 100;
//        }
//        System.out.println(Arrays.toString(arr));

//      자바 변수의 유효범위 : {}
//        int num = 10;
//        if (num > 1) {
//            int abc = 20;
//            num = 20;
//
//        }
////        abc = 30;  if문 밖에 서는 abc 변수의 존재를 모름.
//        System.out.println(num);

//        다중반복문 2~9단 예제
//        for (int i = 2; i < 10; i++) {
//            System.out.println(i+" 단입니다.");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " * " + j + " = " + i*j);
//            }
//        }

//        라벨문 : 반복문에 이름을 붙이는것
//        boolean end = false;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println("hello world");
//                if (j == 2) {
//                    break;
//                }
//            }
//            if (end == true) {
//                break;
//            }
//        }

//        int[][] arr = {{1, 2, 3}, {4, 5, 11}, {7, 8, 9}, {10, 11, 12}};
//        loop1:
//        for (int i = 0; i < 4; i++) {
//            loop2:
//            for (int j = 0; j < 3; j++) {
//                if (arr[i][j] == 11) {
//                    System.out.println(i + ", " + j + "에 있습니다.");
//                    break loop1;
//
//                }
//            }
//
//        }

//        100~200까지 수중에서 가장 작은 소수를 출력
        for (int input = 100;input<=200; input++){
            boolean answer = false;
            for (int i = 2; i*i<=input; i++){
                if (input % i == 0){
                    answer = true;
                    break;
                }
            }
            if (!answer){
                System.out.println(input);
                break;
            }
        }

    }
}
