package C01Basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C07Array {
    public static void main(String[] args) {
//        배열표현식. 리터럴 방식
//        int[] intArr = {1, 3, 5, 7, 9};
//
////        배열표현식2 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 3;
//        intArr2[2] = 5;
//        intArr2[3] = 7;
//        System.out.println(intArr2[4]); // 0으로 초기화
//
////       참조자료형의 배열은 기본적으로 null 초기화
//        String[] stArr = new String[5];
//        stArr[0] = "hello1";
//        stArr[1] = "hello2";
//        stArr[2] = "hello3";
////        아ㅏ래코드는 nullpointexception
//        for (int i = 0; i < stArr.length; i++) {
//            if (stArr[i].equals("hello2")) {
//                System.out.println("hello가 있습니다.");
//            }
//        }

//        배열표현3
//        int[] intArr3 = new int[]{1, 3, 5, 7, 9};
//        List<int[]> list1 = new ArrayList<>();
//        list1.add(new int[]{1, 3, 5, 7, 9});
//        System.out.println(list1.get(0));

//        배열표현4
//        int[] intaArr4 = new int[];   불가

//        String[] stArr = new String[5];
//        for (int i = 0; i < stArr.length; i++) {
//            stArr[i] = "";
//        }
//        Arrays.fill(stArr, "hello");
//        System.out.println(Arrays.toString(stArr));

//        85, 65, 90 인 int 배열을 선언하고, 총합, 평균을 구하자.
//        int[] intArr = new int[]{85, 65, 90};
//        int total = 0;
//        int avg = 0;
//
//        for (int i = 0; i < intArr.length; i++) {
//            total += intArr[i];
//            avg = total/ intArr.length;
//        }
//        System.out.println(total);
//        System.out.println(avg);
//
////        q배열의 최대값, 최소값
//        int[] arr2 = {10, 20, 30, 12, 8, 17};
//        int max = Integer.MAX_VALUE;    // arr2[0]도 가능.
//        int min = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr2.length; i++) {
//            if (max < arr2[i]) {
//                max = arr2[i];
//            }
//            if (min > arr2[i]) {
//                min = arr2[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);

//        배열의 자리 바꾸기
//        int[] arr = {20, 10, 30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        int[] arr2 = {10, 20, 30, 40, 50};
//        for (int i = 0; i < arr2.length -1; i++) {
//
//                int temp = arr2[i];
//                arr2[i] = arr2[i + 1];
//                arr2[i + 1] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));

//        배열뒤집기 : 새로운배열을 선언하여, arr을 뒤집을 배열 생성
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] newArr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            newArr[arr.length -1-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));

//        int[] arr = {17, 12, 20, 10, 25};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        선택정렬 알고리즘 구현
//        int[] arr = {17, 12, 20, 10, 25};
//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = arr[i];
//            int minIndex = i;
//            for (int j = i+1; j < arr.length; j++) {
//                if (min > arr[j]) {
//                    min  = arr[j];
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        문자정렬. 아스키코드기준으로 정렬(오름차순)
        String[] fruits = {"banana", "apple", "cherry"};
//        Arrays.sort(fruits);
//        System.out.println(fruits);
        String[] fruits2 = {"apple", "applee", "applef", "b"};
        Arrays.sort(fruits2);
        System.out.println(Arrays.toString(fruits2));

//        내림차순 : 기본형타입은 Comparator로 처리 불가.
        Arrays.sort(fruits, Comparator.reverseOrder());
        int[] arr = {5, 1, 2, 3, 6};

//        k번째수 프로그래머스












    }
}
