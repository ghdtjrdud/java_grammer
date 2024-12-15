package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C0209copy {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

//        combi(myList, answer, temp, 2, 0);
//        System.out.println(answer);

        permu(myList, answer, temp, 2, new boolean[myList.size()]);
        System.out.println(answer);
    }

    public static void combi(List<Integer> myList, List<List<Integer>> answer, List<Integer> temp, int count, int a){
        if (temp.size() == count) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i = a; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combi(myList, answer, temp, count, i+1);
            temp.remove(temp.size() - 1);
        }

    }

    public static void permu(List<Integer> myList, List<List<Integer>> answer, List<Integer> temp, int count, boolean[] visit){
        if (temp.size() == count) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if (visit[i] == false) {
                visit[i] = true;
                temp.add(myList.get(i));
                permu(myList, answer, temp, count, visit);
                temp.remove(temp.size() - 1);
                visit[i] = false;
            }
        }

    }


}
