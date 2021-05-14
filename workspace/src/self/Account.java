package self;

public class Account {
    private String account;
    private String name;
    private int balance;

    public Account(String account, String name, int balance){
        this.account = account;
        this.name = name;
        this.balance = balance;
    }

    void deposit(int money){
        balance += money;
    }

    void withdraw(int money){
        balance -= money;
    }
    public String toString(){
        return "[계좌] " + account + "          [예금주] " + name + "[잔액] " + balance;
    }

}
