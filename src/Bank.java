public class Bank {
    private int acc_no;
    private int acc_id;
    private String acc_type;
    private String acc_holder_name;
    private String getAcc_holder_nic;
    private double acc_balance;
    private double depositamount;
    private double withdrawamount;
    private double currentbalance;

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public int getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public String getAcc_holder_name() {
        return acc_holder_name;
    }

    public void setAcc_holder_name(String acc_holder_name) {
        this.acc_holder_name = acc_holder_name;
    }

    public String getAcc_holder_nic() {
        return getAcc_holder_nic;
    }

    public void setAcc_holder_nic(String getAcc_holder_nic) {
        this.getAcc_holder_nic = getAcc_holder_nic;
    }

    public double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public double getDepositamount() {
        return depositamount;
    }

    public void setDepositamount(double depositamount) {
        this.depositamount = depositamount;
    }

    public double getWithdrawamount() {
        return withdrawamount;
    }

    public void setWithdrawamount(double withdrawamount) {
        this.withdrawamount = withdrawamount;
    }

    public double getCurrentbalance() {
        return currentbalance;
    }

    public void setCurrentbalance(double currentbalance) {
        this.currentbalance = currentbalance;
    }
}
class BankStatement{
    public static void main(String[] args) {
        Bank b= new Bank();
        b.setAcc_no(123456789);
        b.setAcc_id(9876);
        b.setAcc_type("Personal");
        b.setAcc_holder_name("Kamal");
        b.setAcc_holder_nic("123456789000");
        b.setAcc_balance(84567.93);
        b.setDepositamount(25000.00);
        b.setWithdrawamount(65000.00);
        b.setCurrentbalance(44567.93);
        System.out.println("Bank Statement");
        System.out.println("Account Number :- " + b.getAcc_no());
        System.out.println("AccountID :- 0" + b.getAcc_id());
        System.out.println("Account Type :- " + b.getAcc_type());
        System.out.println("Account Holder :- " + b.getAcc_holder_name());
        System.out.println("Account Holder NIC :- " + b.getAcc_holder_nic());
        System.out.println("Account balance :- " + b.getAcc_balance());
        System.out.println("Deposit Amount :- " + b.getDepositamount());
        System.out.println("Withdraw Amount :- " + b.getWithdrawamount());
        System.out.println("Current Amount :- " + b.getCurrentbalance());

    }
}