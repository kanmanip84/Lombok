import java.util.Scanner;
public class BankingApp {
    public static void main(String[] args) {

        System.out.println(setDetails());
        System.out.println(setDeposit());
        withdraw wd=new withdraw();
        System.out.println(wd.getWithdraw());

    }

    private static String setDetails() {
        System.out.println("Account Details:");
        System.out.println("-----------------");
        BankDetails bt = new BankDetails("Kanmani", "111", "Savings", 56000);
        System.out.println("Name of account holder: " + bt.getName());
        System.out.println("Account no.: " + bt.getAccno());
        System.out.println("Account type: " + bt.getAcc_type());
        System.out.println("Balance: " + bt.getBalance());
        return(" ");
    }


    private static String setDeposit() {
        System.out.println("Deposit Details:");
        System.out.println("-----------------");
        BankDetails1 bt = new BankDetails1(5000);
        System.out.println("Last Deposited Money to your A/C:" + bt.getAmt());
        return("");
    }



}
