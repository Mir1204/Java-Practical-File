
public class pract23s {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.addAccount();
    }
}

class Bank {
    Account[] accounts = new Account[10];
    int count = 0;

    void addAccount() {
        accounts[count] = new SavingsAccount();
        accounts[count].deposit(1000);
        accounts[count].withdraw(500);
        accounts[count].calculateInterest();
        accounts[count].viewBalance();
        count++;
        accounts[count] = new CurrentAccount();
        accounts[count].deposit(1000);
        accounts[count].withdraw(500);
        accounts[count].calculateInterest();
        accounts[count].viewBalance();
    }
}

interface Account {
    void deposit(int amount);

    void withdraw(int amount);

    void calculateInterest();

    void viewBalance();
}

class SavingsAccount implements Account {
    int balance = 0;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void calculateInterest() {
        System.out.println("Interest calculated");
    }

    public void viewBalance() {
        System.out.println("Balance: " + balance);
    }
}

class CurrentAccount implements Account {
    int balance = 0;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void calculateInterest() {
        System.out.println("Interest calculated");
    }

    public void viewBalance() {
        System.out.println("Balance: " + balance);
    }
}
