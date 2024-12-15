package C01Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C0209Queen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            myList.add(i);
        }
        List<Integer> temp = new ArrayList<>();
        boolean[] visit = new boolean[n];
    }

    public static void chess (List<Integer> myList, List<Integer> temp, int n, boolean[] visit, int count, int col) {
        if (temp.size() == n) {

            count++;
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if (visit[i] == false) {
                visit[i] = true;
                temp.add(myList.get(i));
                chess(myList, temp, n, visit, count, col);
                temp.remove(temp.size() - 1);
                visit[i] = false;
            }
        }

    }

}
