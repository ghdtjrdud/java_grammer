package C01Basic;

import java.util.Scanner;

public class C04Statements {
    public static void main(String[] args) {

//        도어락키 예제
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if (answer == input){
//            System.out.println("문이 열렸습니다.");
//        }else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

//        버스카드 예제
//        if, else if 구문에서 조건식은 위에서부터 실행되어 하나가 충족되면 끝.
//        System.out.println("현재 가지고 계신 돈은 얼마인가요");
//        Scanner sc = new Scanner(System.in);
//        int myMoney = sc.nextInt();
//        if (myMoney >= 10000) {
//            System.out.println("댁시를 타시오");
//        } else if (myMoney >= 3000) {
//            System.out.println("버스를 타시오");
//        } else if (myMoney >= 2000) {
//            System.out.println("킥보드를 타시오");
//        }else {
//            System.out.println("걸어가시오");
//        }


//        단독으로 쓰이는 if문들의 존재할 경우에는 정확한 범위지정을 하지 않으면
//        모든 if문이 중복되어 실행될 가능성이 존재
//        if (myMoney >= 10000) {
//            System.out.println("댁시를 타시오");
//        }
//        if (myMoney >= 3000) {
//            System.out.println("버스를 타시오");
//        }
//        if (myMoney >= 2000) {
//            System.out.println("킥보드를 타시오");
//        }else {
//            System.out.println("걸어가시오");
//        }

//        삼항연산자 : 결과값 = 조건식 ? 반환값1 : 반환값2
////        도어락키 예제
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        String result = answer == input ? "문이 열렸습니다." : "비밀번호가 틀렸습니다.";
//        System.out.println(result);

//        switch문
         Scanner sc = new Scanner(System.in);
//         String num = sc.nextLine();
//         if (num.equals("1")){
//             System.out.println("대출업무입니다.");
//         } else if (num.equals("2")) {
//             System.out.println("예금업무입니다.");
//         } else if (num.equals("3")) {
//             System.out.println("적금업무입니다.");
//         } else if (num.equals("0")) {
//             System.out.println("상담사연결입니다.");
//         }else {
//             System.out.println("잘못된 번호입니다.");
//         }

         int input = sc.nextInt();
         switch (input) {
             case 1:
                 System.out.println("대출업무입니다.");
                 break;
             case 2:
                 System.out.println("예금업무입니다..");
                 break;
             case 3:
                 System.out.println("적금업무입니다.");
                 break;
             case 0:
                 System.out.println("상담사연결입니다..");
                 break;
             default:
                 System.out.println("잘못된 입력입니다.");
                 break;
         }



    }
}
