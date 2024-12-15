package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C0209NandM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int m = sc.nextInt();

//        List<List<Integer>> answer = new ArrayList<>();
//        int[] answer = new int[n*n];
        List<Integer> myList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            myList.add(i);
        }
        cal(sb, myList, temp, m, new boolean[myList.size()]);
//        sb.append(answer).append("\n");
        System.out.println(sb);
    }
    public static void cal(StringBuilder sb, List<Integer> myList, List<Integer> temp, int count, boolean[] visit) {
        if (temp.size() == count) {
            for (int num : temp) {
                sb.append(num).append(" "); // 이부분 이해안감.
//                sb.append(num).append("\n")
            }
            sb.append("\n");
            return;
//            answer[Integer.parseInt(temp)];

        }
        for (int i = 0; i < myList.size(); i++) {
            if (visit[i] == false) {
                visit[i] = true;
                temp.add(myList.get(i));
                cal(sb, myList, temp, count, visit);
                temp.remove(temp.size() - 1);
                visit[i] =false;
            }
        }
    }

}
