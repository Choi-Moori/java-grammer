package C04Interface.BankService;

// BankService(인터페이스), BankCardService, BankkaKaoService
public class BankCardService implements BankService{

    @Override
    public void deposit(int money, BankAccount bankAccount){
        int mymoney = bankAccount.getBalance();
        int total = mymoney + money;
        System.out.println(money+"원 카드로 입금되었습니다.");
        bankAccount.updateBalance(total);
        System.out.println("현재 잔액은 " + total);
    }
    @Override
    public void withdraw(int money, BankAccount bankAccount){
        int mymoney = bankAccount.getBalance();
        int total = mymoney - money;
        if(total < 0){
            System.out.println("잔액 부족입니다.");
        }else {
            bankAccount.updateBalance(total);
            System.out.println(money + "원 카드로 출금되었습니다.");
        }
        System.out.println("현재 잔액은 " + total);
    }
}
