class Bank {
    private String name;
    private int accNo;
    private int balance;

    public Bank(String name, int accNo, int balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getaccNo() {
        return accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setaccNo(int setaccNo) {
        this.accNo = accNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

public class Amount {
    public static void main(String[] args) {
        Bank bank = new Bank("Satyam Panchal", 221116237, 999999);
        System.out.println("Account Holder name is " + bank.getName() + " , account number is " + bank.getaccNo()
                + ", balance is " + bank.getBalance());

        bank.deposit(10000);
        System.out.println("Account Holder name is " + bank.getName() + " , account number is " + bank.getaccNo()
                + ", after deposit of amount the  balance is " + bank.getBalance());

        bank.withdraw(5000);
        System.out.println("Account Holder name is " + bank.getName() + " , account number is " + bank.getaccNo()
                + ", after withdrawing amoun the balance is " + bank.getBalance());

        bank.setName("John Doe");
        bank.setaccNo(1234567);
        bank.setBalance(100000);
        System.out.println("Account Holder name is " + bank.getName() + " , account number is " + bank.getaccNo()
                + ", balance is " + bank.getBalance());

        bank.deposit(1000);
        System.out.println("Account Holder name is " + bank.getName() + " , account number is " + bank.getaccNo()
                + ", after deposit of amount the  balance is " + bank.getBalance());

        bank.withdraw(500);
        System.out.println("Account Holder name is " + bank.getName() + " , account number is " + bank.getaccNo()
                + ", after withdrawing amount the balance is " + bank.getBalance());

    }
}
