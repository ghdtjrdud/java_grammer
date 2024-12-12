package C02ClassBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankService2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Account> map = new HashMap<>();
        //        프로그램은 항상 실행될 수 있도록 전체코드를 while(true)처리
        //        서비스번호를 입력하세요. 1. 개설 2. 조회, 3. 입금, 4. 출금, 5. 송금
        while (true) {
            System.out.println("서비스번호를 입력하세요. 1. 개설 2. 조회, 3. 입금, 4. 출금, 5. 송금");
            int input = Integer.parseInt(sc.nextLine());

            switch (input) {
                //        1. 개설 : 계좌번호와 현재 가지고 있는 계신돈을 입력하세요.
                case 1:
                    System.out.println("개설 계좌번호 입력");
                    String acount = sc.nextLine();
                    System.out.println("계좌 잔액 입력");
                    int acountbalance = Integer.parseInt(sc.nextLine());

                    Account ac = new Account(acount, acountbalance);
                    map.put(acount, ac);
                    break;

                //        2. 조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요 -> 잔고출력
                case 2:
                    System.out.println("조회할 계좌 입력");
                    acount = sc.nextLine();
                    Account ac2  = map.get(acount);
                    System.out.println(ac2.getBalance());
                    break;

                    //        3. 입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요
                case 3:
                    System.out.println("입금 계좌 번호 입력");
                    String inaccount = sc.nextLine();
                    System.out.println("입금 금액입력");
                    int inmoney = Integer.parseInt(sc.nextLine());

                    Account ac3 = map.get(inaccount);
                    ac3.deposit(inmoney);
                    System.out.println("현재잔액 :" + ac3.getBalance());
                    break;

                    //        4. 출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요(잔액검증 필요)
                case 4:
                    System.out.println("출금 계좌번호 입력");
                    String outaccount = sc.nextLine();
                    System.out.println("출금 금액입력");
                    int outmoney = Integer.parseInt(sc.nextLine());

                    ac = map.get(outaccount);
                    ac.withdraw(outmoney);

                    System.out.println("현재잔액 :" + ac.getBalance());
                    break;

                    //        5. 송금 : 송금서비스입니다. 내계좌번호, 상대계좌번호 송금금액 입력해주세요
                case 5:
                    System.out.println("출금 계좌번호 입력");
                    outaccount = sc.nextLine();
                    System.out.println("입금 계좌번호 입력");
                    inaccount = sc.nextLine();
                    System.out.println("송금 금액입력");
                    outmoney = Integer.parseInt(sc.nextLine());

                    Account outA = map.get(outaccount);
                    Account inA = map.get(inaccount);
                    outA.send(inA, outmoney);

                    System.out.println("출금계좌 잔액 :" + outA.getBalance());
                    System.out.println("입금계좌 잔액 :" + inA.getBalance());
                    break;

                default:
                    System.out.println("잘못입력하였습니다.");
            }
        }
    }
}

// Account2  개체 : 자체ID값(자동 increment), 계좌번호, 잔액 변수로 구성
class Account {
    static int id;
    String acnum;
    int balance;

    public static int getId() {
        return id;
    }

    public String getAcnum() {
        return acnum;
    }

    public int getBalance() {
        return balance;
    }

    public Account(String acnum, int balance) {
        id++;
        this.id = id;
        this.acnum = acnum;
        this.balance = balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public boolean withdraw(int money) {
        if (balance > money) {
            balance -= money;
            return true;
        } else {
            System.out.println("잔액부족");
            return false;
        }
    }

    public void send(Account inaccount, int money) {
        if (!this.withdraw(money)) {
            return;
        } else {
            inaccount.deposit(money);
        }
    }



}
