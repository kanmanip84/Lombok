import java.util.Scanner;

public class ComputeElectricityBill {
    public static void main(String[] args) {


        /*System.out.println("Enter the Units in double");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();*/
        CalculateElectricityBill eb = new CalculateElectricityBill(300.00,0.00);

        if (eb.getUnits() < 100)
            eb.setBillpay( eb.getUnits() * 1.20);
        else if (eb.getUnits() <= 300) {
            eb.setBillpay( eb.getUnits() * 1.20+ (eb.getUnits() - 100) * 2);
        }
        else if(eb.getUnits() > 300) {
            eb.setBillpay( eb.getUnits() * 1.20+ 200 * 2 + (eb.getUnits() - 300) * 3);
        }

        System.out.println("Bill to pay:"+ eb.getBillpay());
    }

    }



