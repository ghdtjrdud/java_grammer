package C04Interface.BankService;

public class BankCardService implements BankService{
    @Override
    public void deposit(int money, BankAccount ba) {
        ba.setBalance(ba.getBalance()+money);
        System.out.println(money + "원 카드로 입금되었습니다.");
        System.out.println("현재잔액은 " + ba.getBalance() + "원입니다.");
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        ba.setBalance(ba.getBalance()-money);
        System.out.println(money + "원 카드에서 출금되었습니다.");
        System.out.println("현재잔액은 " + ba.getBalance() + "원입니다.");
    }

//    입금시
//    xx원 카드로 입금되었습니다.
//    현재 잔액은 yy원입니다.

//    출금시
//    xx원 카드로 출금되었습니다.
//    현재 잔액은 yy원입니다.


}
