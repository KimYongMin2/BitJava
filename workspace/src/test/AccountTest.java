package test;

class Account{
    public static double interest;
    static String accountNo;
    static String accountName;
    static double balance;

    public static String getAccountNo() {
        return accountNo;
    }

    public static void setAccountNo(String accountNo) {
        Account.accountNo = accountNo;
    }

    public static String getAccountName() {
        return accountName;
    }

    public static void setAccountName(String accountName) {
        Account.accountName = accountName;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        Account.balance = balance;
    }

    public Account(String accountNo, String accountName, int balance){
        Account.setAccountNo(accountNo);
        Account.setAccountName(accountName);
        Account.setBalance(balance);
    }

    void deposit(int money){
        double sumMoney = Account.getBalance() + money;
        Account.setBalance(sumMoney);
    }

    void withdraw(int money){
        double subMoney = Account.getBalance() - money;
        Account.setBalance(subMoney);
    }

    void addInterest(){
        double interestMoney = Account.getBalance() + (Account.getBalance()*interest);
    }

}
public class AccountTest {
    public static void main(String[] args){
        Account customer1=new Account("111-222-33333333","최은희",20000);
        Account customer2=new Account("555-666-77777777","남매월",100000);
        System.out.println("기본 적립금");
        printAccount(customer1);
        printAccount(customer2);
        System.out.println("한번의 입출금");
        customer1.deposit(1000000);
        customer2.withdraw(30000);
        printAccount(customer1);
        printAccount(customer2);
        System.out.println("이자율의 계산");
        Account.interest=0.05;
        customer1.addInterest(); //저축된 금액=원금+원금*이자율
        customer2.addInterest();//저축된 금액=원금+원금*이자율
        printAccount(customer1);
        printAccount(customer2);
    }
    static void printAccount(Account customer){
        System.out.println("계좌번호:"+customer.getAccountNo());
        System.out.println("예금주이름:"+customer.getAccountName());
        System.out.println("잔액:"+customer.getBalance());
        System.out.println();
    }
}