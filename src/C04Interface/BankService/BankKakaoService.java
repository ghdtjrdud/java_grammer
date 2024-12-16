package C04Interface.BankService;

public class BankKakaoService implements BankService{
    @Override
    public void deposit(int money, BankAccount ba) {
        ba.setBalance(ba.getBalance()+money);
        System.out.println(money + "원 카카오페이로 입금되었습니다.");
        System.out.println("현재잔액은 " + ba.getBalance() + "원입니다.");
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        ba.setBalance(ba.getBalance()-money);
        System.out.println(money + "원 카카오페이에서 출금되었습니다.");
        System.out.println("현재잔액은 " + ba.getBalance() + "원입니다.");

    }
}
