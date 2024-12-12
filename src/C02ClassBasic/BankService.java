package C02ClassBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, BankAccount> accounts = new HashMap<>();
//        프로그램은 항상 실행될 수 있도록 전체코드를 while(true)처리
//        서비스번호를 입력하세요. 1. 개설 2. 조회, 3. 입금, 4. 출금, 5. 송금
        while (true) {
            System.out.println("서비스번호를 입력하세요. 1. 개설 2. 조회, 3. 입금, 4. 출금, 5. 송금");
            int input = Integer.parseInt(sc.nextLine());

//        1. 개설 : 계좌번호와 현재 가지고 있는 계신돈을 입력하세요.
            switch (input) {
                case 1:
                    System.out.println("계좌번호를 입력하세요");
                    String account = sc.nextLine();
                    System.out.println("잔액을 입력하세요");
                    int balance = Integer.parseInt(sc.nextLine());

                    BankAccount createAccount = new BankAccount(account, balance);
                    accounts.put(account, createAccount);
                    break;

//        2. 조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요 -> 잔고출력
                case 2:
                    System.out.println("계좌번호를 입력하세요");
                    account = sc.nextLine();
                    BankAccount selectAccount = accounts.get(account);
                    System.out.println(selectAccount.getBalance());
                    break;

//        3. 입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요
                case 3:
                    System.out.println("입금계좌번호 입력");
                    String inaccount = sc.nextLine();
                    System.out.println("금액 입력");
                    int inmoney = Integer.parseInt(sc.nextLine());

                    BankAccount accountDeposit = accounts.get(inaccount);
                    accountDeposit.deposit(inaccount, inmoney);
                    System.out.println(accountDeposit.getAccount());
                    System.out.println(accountDeposit.getBalance());

//        4. 출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요(잔액검증 필요)
                case 4:
                    System.out.println("출금계좌번호 입력");

            }



        }







//        5. 송금 : 송금서비스입니다. 내계좌번호, 상대계좌번호 송금금액 입력해주세요

    }
}

// Account 개체 : 자체ID값(자동 increment), 계좌번호, 잔액 변수로 구성
class BankAccount {
    private String account;
    private int balance;


    public BankAccount(String account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(String account, int money) {
        if (this.account.equals(account)) {
            this.balance = this.balance + money;
        }
    }

    public void whitdraw(String account, int money) {
        if (this.account.equals(account)) {
            if (this.balance > money) {
                this.balance = -money;
            }
        }
    }

}
