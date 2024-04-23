public class ChallengeHell {

    static class BankAccount {
        private final String accountHolder;
        private double balance;

        public BankAccount(String accountHolder, double initialBalance) {
            this.accountHolder = accountHolder;
            this.balance = initialBalance;
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit: $" + amount + " Success!");
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdraw: $" + amount + " Success!");
            } else {
                System.out.println("Insufficient balance!");
            }
        }
    }

    public static class BankingSystem {
        public static void main(String[] args) {
            // Variable dan tipe data
            String name = "John Doe";
            int age = 30;
            double initialBalance = 1000.0;

            // Array
            String[] transactions = {"Deposit", "Withdraw", "Transfer"};

            // Membuat objek BankAccount
            BankAccount account = new BankAccount(name, initialBalance);

            // Perulangan
            for (String transaction : transactions) {
                System.out.println("Transaction: " + transaction);

                // Pengkondisian
                switch (transaction) {
                    case "Deposit" -> account.deposit(500.0);
                    case "Withdraw" -> account.withdraw(300.0);
                    case "Transfer" ->
                        // Simulasi transfer
                            account.withdraw(200.0);

                    // Tambahan: transfer ke rekening lain
                }

                // Getter dan Setter
                System.out.println("Account Holder: " + account.getAccountHolder());
                System.out.println("Current Balance: $" + account.getBalance());
                System.out.println();
            }

            // Function dan Method
            printAccountSummary(account);
        }

        // Function
        public static void printAccountSummary(BankAccount account) {
            System.out.println("Account Summary:");
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Final Balance: $" + account.getBalance());
        }
    }
}
