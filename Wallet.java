
public class Wallet {

    private String walletId;
    private double balance;
    private String ownerName;

    public Wallet(String walletId, String ownerName, double initialBalance) {
        this.walletId = walletId;
        this.ownerName = ownerName;
        this.balance = Math.max(0, initialBalance); 
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " added.");
            System.out.println(" New balance: ₹ " + balance);
        } else {
            System.out.println("Amount must be positive.");
        }
    }
    public boolean deductMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return false;
        } else if (amount > 50000) {
            System.out.println("Transaction limit exceeded , Max allowed is ₹ 50,000.");
            return false;
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " deducted.")  ;
            System.out.println(" New balance: ₹" + balance);
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Wallet myWallet = new Wallet("W123", "John", 10000);
        myWallet.addMoney(5000);
        myWallet.deductMoney(2000);
        myWallet.deductMoney(60000); 
        myWallet.deductMoney(8000); 
    }
}
