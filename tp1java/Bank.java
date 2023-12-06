public class Bank {
    private int accountnumber;
    private String accountholdername;
    private int balance;

    public Bank(int accountnumber, String accountholdername, int balance) {
        this.accountnumber = accountnumber;
        this.accountholdername = accountholdername;
        this.balance = balance;

    }

    public int getaccountnumber() {
        return accountnumber;
    }

    public String getaccountholdername() {

        return accountholdername;
    }

    public int  getbalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;

    }

    public void withdraw(int amount) {
        if (amount < balance) {
            System.out.println("the balance is not sufficient");

        } else {
            balance = balance - amount;
        }
    }
    public void afficher(){
        System.out.printf("name:"+this.accountholdername);
    }
}
