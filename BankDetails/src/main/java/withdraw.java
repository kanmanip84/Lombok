import java.util.Scanner;

public class withdraw {

    public static String getWithdraw() {
        System.out.println("Do u want to Withdraw the money? YES OR NO");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.toUpperCase().equals("YES")) {

            System.out.println("Enter the Amount:");
            Scanner sc1 = new Scanner(System.in);
            int b = sc1.nextInt();
            System.out.println("SUCCESSFULLY WITHDRAW THE AMOUNT:"+b);

            int[] noteValues = {500, 100, 50, 20, 10, 1};
            if (b > 15000) {
                System.out.println("ATM Cash Limit exceeds.");
            } else {
                for (int i = 0; i < noteValues.length && b != 0; i++) {
                    if (b >= noteValues[i])
                        System.out.println("No of " + noteValues[i] + "'s" + " :" + b / noteValues[i]);
                        b = b % noteValues[i];
                }

            }
        }
        else{
            System.out.println("TRANSACTION CANCELLED");
        }
    return("");
    }
}
