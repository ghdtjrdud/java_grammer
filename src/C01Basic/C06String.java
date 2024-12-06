package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
//        참조자료형 : 기본자료형을 제외한 모든 자료형
//        String st1 = new String("hello");
////        리터럴 방식 허용 : 권장되는 방식
//        String st2 = "hello";
////        참조문자이므로 == 비교는  메모리 주소가 되고, 값을 비교할 때에는 .equauls 써야함
//        System.out.println();
//
////        WrapperClass : 기본형 타입을 Wrapping한 클래스
//        int a = 10;
//        Integer b = new Integer(10);
//        int c = b;  // 자동으로 형번환 해줌. auto unboxing
//        Integer d = a;  // 기본자료형 -> WrapperClass 로 형변환. auto boxing

//        int 에서 String 으로
//        int a = 10;
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);
//
////        String 에서 int 로
//        int b = Integer.parseInt(st1);
//
////        배열에는 원시타입 자료형 세팅
//        int[] arr = {10, 20, 30};
//
////        리스트에는 참조자료형 세팅
////        참조자료형에 원시자료형을 담을때는 WrapperClass 를 사용해야 함
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

//        리터럴 방식허용 : 권장되는 방식(문자pool을 통해 성능향상)
//        String st1 = "hello";
//        String st2 = "hello";
////        참죠자료형이므로 == 비교는 메모리 주소가 되고, 값을 비교할 때에는 .equals 사용
//        System.out.println(st1.equals(st2));
//        System.out.println(st2==st3);
//
//        char ch1 = '가';
//        char ch2 = '가';
//        System.out.println(ch1 == ch2);

//        .equals 중에 대소문자 무시
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "Hello1";
//        System.out.println(st1.equals(st2));
//        System.out.println(st2.equals(st3));
//        System.out.println(st2.equalsIgnoreCase(st3));

//        문자열의 길이 : length()
//        String st1 = "hello1 java1 world2";
//        System.out.println(st1.length());
//        int count = 0;
//        for (int i = 0; i < st1.length(); i++) {
//            if (st1.charAt(i) > 96 && st1.charAt(i) < 123) {
//                count++;
//            }
//        }
//        System.out.println(count);
//
////        a의 개수가 몇개인지 출력
//        String st2 = "abcdefabaadf";
//        int count1 = 0;
//        for (int i = 0; i < st2.length(); i++) {
//            if (st2.charAt(i) == 'a') {
//                count1++;
//            }
//        }
//        System.out.println(count1);

//        toCharArray() : String 문자열을 char배열로 리턴
//        int count = 0;
//        char[] chArr = st2.toCharArray();
//        for (int i = 0; i < chArr.length; i++) {
//            if (chArr[i] == 'a') {
//                count++;
//            }
//        }
//        System.out.println(count);
//       for(char ch : chArr){
//       if(ch == 'a')
//       }

//        indexof : 특정 문자열의 위치 변환, 가장 먼저 나오는 문자열의 위치
//        String st1 = "hello java java";
//        System.out.println(st1.indexOf("java"));
//
////        contains : 특정 문자열이 있는지 여부 boolean
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));

//        문자열 더하기 : +=
//        String st1 = "hello";
//        st1 += "world";
//        System.out.println(st1);

//          substring(a,b) : a이상 b미만의 index의 문자를 잘라 반환
//        String st1 = "hello world";
//        System.out.println(st1.substring(5,st1.length()));
//
//        String my_string = "abcdef";
//        String letter = "f";
//        String answer = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            if (!my_string.substring(i, i + 1).equals(letter)) {
//                answer += my_string.substring(i, i + 1);
//
//            }
//        }
//        System.out.println(answer);

//        trim, strip : 문자열 양쪽 끝의 공백 제거
//        String st1 = " hello world    ";
//        String trimSt1 = st1.trim();
//        String stripSt1 = st1.strip();
//        System.out.println(trimSt1);
//        System.out.println(stripSt1);
//
////        toUpperCase : 대문자로 변환, toLowewrCase : 소문자로 변환
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);

////        char -> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
////        String -> char
//        char ch2 = st1.charAt(0);

//        replace(a,b) : a 문자열을 b 문자열로 ㄷ체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);

//        replaceAll(a,b) : replace 와 동일, 정규표현식을 쓸 수 있는점이 차이.
//        String st1 = "01abc123한글123";
////        for문을 활용해서 소문자 알파벳만 제거한 새로운 문자열 생성
//        String answer = "";
//
//        for (int i = 0; i < st1.length(); i++) {
//            if (st1.charAt(i) < 'a' || st1.charAt(i) > 'z') {
//                answer += st1.charAt(i);
//
//            }
//        }
//        String aswer2 = st1.replaceAll("[a-z]+", "");
//        System.out.println(aswer2);
////        [a-z]+ : 1개 이상의 소문자 알파벳
////        [A-Za-z]| : 대소문자 포함한 알파벳
////        [가-힣]+ : 한글
////        [0-9]+ : 숫자
//
//        String input = "hello";
//        System.out.println(input.matches("[A-Za-z]+"));
//        if (input.matches("[A-Za-z]+")) {
//            System.out.println("제대로 입력하였습니다.");
//        } else {
//            System.out.println("잘못입력했습니다.");
//        }
//
////        전화번호 검증
//        String number = "010-1234-5677";
//        boolean b1 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number);
//
////        이메일 검증 : 소문자@소문자알파벳.com
//        String email = "hello@naver.com";
//        boolean b2 = Pattern.matches("^[a-z]+@[a-z]+.com$", email);
//        System.out.println(b2);
//    }
//}

//        split : 특정 문자를 기준으로 문자열을 자르는것.
//        String a = "a:b:c:d";
//        String[] arr1 = a.split(":");
//        System.out.println(Arrays.toString(arr1));
//
//        String b = "a b c  d ";
//        String[] arr2 = b.split(" ");
////        \s:공백
//        String[] arr3 = b.split("\\s+");
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//        int count = 0;
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] == "") {
//
//            } else {
//                count++;
//            }
//        }
//        System.out.println(count);

//        null과 공백의 차이
//        String st1= null;
//        String st2 = "";
//        String st3 = "hello";
//        System.out.println(st1 == st2); //false
//        System.out.println(st3.isEmpty()); //false
//        System.out.println(st2.isEmpty()); //true
//        System.out.println(st1.isEmpty()); //nullproinstexception
//
//        String[] arr = {"hello", "java", null, "pyhton"};
//        int answer = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != null && arr[i].equals("python")) {
//                answer = i;
//            }
//        }

//        문자열 조립
//        String[] arr = {"java", "python", "javascript"};
//        String answer = "";
//        for (String a : arr) {
//            answer += a;
//        }
//
////        문자열 조합2
//        String answer2 = String.join(":", arr);
//        System.out.println(answer2);

//        StringBuffer : 문자열 조합
//        StringBuffer sb = new StringBuffer();
//        sb.append("java").append("pyhton").append("javascript");
//        String answer = sb.toString();
//        System.out.println(answer);
//
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("java").append("\n");
//        sb2.append("python").append("\n");
//        sb2.append("javasript").append("\n");
//        String answer3 = sb2.toString();
//        System.out.println(answer3);

//        문자열 뒤집기
//        String st1 = "hello";
//        String answer = "";
//        StringBuilder sb1 = new StringBuilder();
//        for (int i = st1.length() - 1; i >= 0; i--) {
//            sb1.append(st1.charAt(i));
//        }
//        answer = sb1.toString();
//        StringBuilder sb = new StringBuilder(st1);
//        String answer2 = sb.reverse().toString();

//      프로그래머스 문자열 밀기
//        String a = "hello";
//        String b = "ohell";
//        int answer = -1;
//        if (a.equals(b)) {
//            answer = 0;
//        } else {
//            int count = 0;
//            StringBuilder sb = new StringBuilder(a);
//            for (int i = a.length()-1; i >= 0 ; i--) {
//                sb.insert(0, a.charAt(i));
//                sb.deleteCharAt(sb.length() - 1);
//                if (sb.toString().equals(b)) {
//                    answer = count;
//                    break;
//
//                }
//            }
//        }
//        System.out.println(answer);






    }
}

