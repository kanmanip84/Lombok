import java.util.Scanner;

public class OnlinePayment {
    public static void main(String[] args) {
        System.out.println("Category of payment");
        System.out.println("----------------");
        String[] strAr1 = new String[]{"Rent Payment", "Maintenance Payment", "Event Payment"};
        for (int i = 0; i < strAr1.length; i++) {
            System.out.println(strAr1[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Category");
        System.out.println("----------------");
        GatedCommunity gc = new GatedCommunity();
        String a = sc.next();
        gc.setCategory(a);

        System.out.println("Mode of Payments");
        System.out.println("----------------");
        String[] strAr2 = new String[]{"Net Banking", "Card", "UPI"};
        for (int i = 0; i < strAr2.length; i++) {
            System.out.println(strAr2[i]);
        }
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Select the Mode");
        System.out.println("----------------");
        String b = sc.next();
        b += sc.nextLine();

        if (b.toUpperCase().equals("NET BANKING")) {
            System.out.println("Available Banks");
            System.out.println("----------------");
            String[] strAr3 = new String[]{"HDFC", "ICICI", "Indian Bank", "State Bank"};
            for (int i = 0; i < strAr3.length; i++) {
                System.out.println(strAr3[i]);
            }
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Select the Bank");
            System.out.println("----------------");
            String c = sc.next();
            c += sc.nextLine();
            // System.out.println("selected bank"+c);
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter ur A/C No:");
            long d = sc.nextLong();
            Scanner sc4 = new Scanner(System.in);
            System.out.println("Enter the Amount:");
            int e = sc.nextInt();
            System.out.println("Are u sure!Do u want to make the payment? YES OR NO");
            Scanner sc6 = new Scanner(System.in);
            String f = sc6.next();
            if (f.toUpperCase().equals("YES")) {

                System.out.println("SUCCESSFULLY PAID");

            } else {
                System.out.println("TRANSACTION CANCELLED");
            }


        } else if (b.toUpperCase().equals("UPI")) {
            System.out.println("Scan QR Code and Enter the Amount");
            Scanner sc5 = new Scanner(System.in);
            sc5.nextInt();
            System.out.println("Are u sure!Do u want to make the payment? YES OR NO");
            Scanner sc6 = new Scanner(System.in);
            String e = sc6.next();
            if (e.toUpperCase().equals("YES")) {

                System.out.println("SUCCESSFULLY PAID");

            } else {
                System.out.println("TRANSACTION CANCELLED");
            }

        }
        else {
            System.out.println("Enter Card No:");
            Scanner sc6= new Scanner(System.in);
            sc6.nextInt();
            System.out.println("Enter PIN:");
            Scanner sc7= new Scanner(System.in);
            sc7.nextInt();
            System.out.println("Enter Amount:");
            Scanner sc8= new Scanner(System.in);
            sc8.nextInt();
            System.out.println("Are u sure!Do u want to make the payment? YES OR NO");
            Scanner sc9 = new Scanner(System.in);
            String e = sc6.next();
            if (e.toUpperCase().equals("YES")) {

                System.out.println("SUCCESSFULLY PAID");

            } else {
                System.out.println("TRANSACTION CANCELLED");
            }

        }

    }
}
