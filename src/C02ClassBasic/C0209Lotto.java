package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class C0209Lotto {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            String[] stArr = input.split(" ");
            int k = Integer.parseInt(stArr[0]);
            int[] arr = new int[k];

            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(stArr[i + 1]);
            }

            StringBuilder sb = new StringBuilder();
            List<Integer> temp = new ArrayList<>();

            combi(arr, sb, temp, 0);
            System.out.println(sb);
        }
    }

    public static void combi(int[] arr, StringBuilder sb, List<Integer> temp, int start) {
        if (temp.size() == 6) {
            for (int a : temp) {
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }
            for (int i = start; i < arr.length; i++) {
                temp.add(arr[i]);
                combi(arr, sb, temp, i+1);
                temp.remove(temp.size() - 1);
            }
    }
}