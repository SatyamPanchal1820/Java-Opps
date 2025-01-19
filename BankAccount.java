class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;


    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        setAccountNumber(accountNumber); 
        setBalance(balance); 
        setAccountHolderName(accountHolderName); 
    }


    public String getAccountNumber() {
        return accountNumber;
    }

   
    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && accountNumber.length() == 10 && accountNumber.matches("\\d+")) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Error: Account number must be a 10-digit string.");
        }
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

 
    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.trim().isEmpty()) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Error: Account holder name cannot be empty.");
        }
    }


    public static void main(String[] args) {
     
        BankAccount bankAccount = new BankAccount("0123456789", 1000.50, "Christine");

        bankAccount.setBalance(-1.23); 

        bankAccount.setAccountHolderName(""); 

        bankAccount.setAccountNumber("1234"); 
    }
}
