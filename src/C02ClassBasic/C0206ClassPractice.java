package C02ClassBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C0206ClassPractice {
    public static void main(String[] args) {
//         Acount를 담을 자료구조로서 List로 사용
        List<Acount> acounts = new ArrayList<>();
        Acount a1 = new Acount("111111", 100000);
        Acount a2 = new Acount("222222", 100000);
        acounts.add(a1);
        acounts.add(a2);
//        계좌번호 목록조회
        for (Acount a : acounts) {
            System.out.println(a.getAcnumber());
        }
//        사용자1이 사용자2에게 돈을 보내는 상황 : 계좌번호를 알고있는 상황
        for (Acount a : acounts) {
            if (a.getAcnumber().equals("111111")) {
                a1.setBalance(a1.getBalance()-50000);
            }
            if (a.getAcnumber().equals("222222")) {
                a1.setBalance(a1.getBalance() + 50000);
            }
        }
//        계좌번호 잔고조회
        for (Acount a : acounts) {
            System.out.println("계좌번호는 " + a.getAcnumber() + "잔고는 " + a.getBalance());
        }

//        Map을 자료구조로 사용시
        Map<String, Acount> map = new HashMap<>();
        map.put("1234", new Acount("1234", 100000));
        map.put("4321", new Acount("4321", 100000));

        Acount myAccount = map.get("1234");
        Acount yourAccount = map.get("4321");
        myAccount.setBalance(myAccount.getBalance()-50000);
        yourAccount.setBalance(yourAccount.getBalance()+50000);


    }
}

class Acount {
    private String acnumber;
    private int balance;

    public Acount(String acnumber, int balance) {
        this.acnumber = acnumber;
        this.balance = balance;
    }

    public String getAcnumber() {
        return acnumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}


