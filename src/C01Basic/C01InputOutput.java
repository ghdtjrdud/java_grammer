package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C01InputOutput {
    public static void main(String[] args) throws IOException {
//        출력 : System.out 을 통해 콘솔출력 / sout 단축키
//        System.out.println(20);
//        System.out.print("hello world"); // print는 줄바꿈 x
//        System.out.print("hello world2");

//        입력 : System.in(키보드입력) + Scanner활용 (입력을 위한 클래스)
//        nextLine 메서드 : 입력받은 데이터를 한줄로 읽어서, String 으로 리턴
//        Scanner sc = new Scanner(System.in);    // scanner객체를 sc변수에 할당
//        String inputLine = sc.nextLine();
//        System.out.println("입력사항 : " + inputLine);

/*  예를 들어 아래와 같은 입력값이 주어질때 처리방법
    abc
    bcd
    2
 */
//
//        Scanner sc = new Scanner(System.in);
//        String inputLine1 = sc.nextLine();
//        String inputLine2 = sc.nextLine();
//        int count = sc.nextInt();
//        System.out.println("입력사항1 : " + inputLine1);
//        System.out.println("입력사항2 : " + inputLine2);
//        System.out.println("입력사항3 : " + count);

//        입력 : System.in + BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        System.out.println(input1);

        String[] input2 = br.readLine().split(" ");
        System.out.println(input2[0]);
        System.out.println(input2[1]);
        System.out.println(input2[2]);

//        StringTokenizer를 통해 공백을 기준으로 문자열을 하나씩 잘라서 담음
        String input3 = br.readLine();
        StringTokenizer st = new StringTokenizer(input3);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());

    }
}
