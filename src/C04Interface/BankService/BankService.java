package C04Interface.BankService;

// 추후 확장성을 위해 interface 를 활용하는 것이 좋다.

public interface BankService {
    void deposit(int a, BankAccount b);
    void withdraw(int a, BankAccount b);
}