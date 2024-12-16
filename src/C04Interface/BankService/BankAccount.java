package C04Interface.BankService;

public class BankAccount {
    private String accountNumber;
    private int balance;

//    생성자 추가 (accountNumber)

    public void updateBalance(int balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
//    getter, balance 없데이트
}
