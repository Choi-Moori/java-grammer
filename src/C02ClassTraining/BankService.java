package C02ClassTraining;

import java.util.ArrayList;
import java.util.Scanner;

public class BankService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> bankAccount = new ArrayList<>();
        while(true){
            System.out.println("서비스 선택 : 1.계좌개설, 2.입금, 3.출금, 4.계좌송금, 5.잔액조회");
            int service = Integer.parseInt(sc.nextLine());
            if(service == 1){
                System.out.println("계좌 개설 " + "\n" + "계좌번호를 입력하세요.");
                String accountnum = sc.nextLine();
                bankAccount.add(new BankAccount(accountnum));
            }
            else if(service == 2){
                System.out.println("입금하실 계좌번호 입력");
                String accountum = sc.nextLine();
                int res = findAccount(bankAccount, accountum);
                if(res != -1) {
                    System.out.println("얼마 임금하시겠어요?");
                    bankAccount.get(res).deposit(Integer.parseInt(sc.nextLine()));
                }
                else{
                    System.out.println("등록된 계좌번호가 존재하지 않습니다.");
                }
            }
            else if(service == 3){
                System.out.println("출금하실 계좌번호 입력");
                String accountum = sc.nextLine();
                int res = findAccount(bankAccount, accountum);
                if(res != -1) {
                    System.out.println("얼마 출금하시겠어요?");
                    bankAccount.get(res).withdraw(Integer.parseInt(sc.nextLine()));
                }
                else{
                    System.out.println("등록된 계좌번호가 존재하지 않습니다.");
                }
            }
            else if(service == 4){
                System.out.println("송금할 계좌번호 입력");
                String accountnum1 = sc.nextLine();
                System.out.println("송금받을 계좌번호 입력");
                String accountnum2 = sc.nextLine();
                int numsend = findAccount(bankAccount, accountnum1);
                int numrecive = findAccount(bankAccount, accountnum2);
                if(numsend != -1 && numrecive != -1) {
                    System.out.println("얼마 송금하시겠어요");
                    int money = Integer.parseInt(sc.nextLine());
                    bankAccount.get(numsend).transfer(bankAccount.get(numrecive), money);
                }
                else{
                    System.out.println("등록된 계좌번호가 존재하지 않습니다.");
                }
            }
            else if(service == 5){
                System.out.println("잔액 조회할 계좌번호 입력");
                String accountnum = sc.nextLine();
                int num = findAccount(bankAccount, accountnum);
                if(num != -1)
                    System.out.println(bankAccount.get(num).getBalance());
            }
        }
    }
    public static int findAccount(ArrayList<BankAccount> array, String accounttnum){
        for(int i = 0 ; i < array.size() ; i++){
            if(array.get(i).getAccountNumber().equals(accounttnum)) return i;
        }
        return -1;
    }
}

class BankAccount{
    private String accountNumber;
    private int balance;

    BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }

    public void deposit(int num){
        this.balance += num;

        System.out.println(num +"원 입금되었습니다.");
        System.out.println("현재 잔액 : " + num);
    }

    public void withdraw(int num){
        if(balance-num >= 0) {
            balance -= num;
            System.out.println(num + "원 출금되었습니다.");
            System.out.println("현재 잔액 : " + num);
        }
        else{
            System.out.println("잔액이 부족합니다.");
        }
    }
    public void transfer(BankAccount BaA, int money){
        this.withdraw(money);
        BaA.deposit(money);
    }
}
