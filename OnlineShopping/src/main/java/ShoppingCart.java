import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        OnlineShopping os=new OnlineShopping();

        Scanner scan = new Scanner(System.in);
        int itemsInTheCart=0;
        System.out.print("Please enter the number of items in your cart: ");
        itemsInTheCart = scan.nextInt();
        os.setItemsInTheCart(itemsInTheCart);

        int[] itemsCart = new int[itemsInTheCart];

        for(int i = 0; i < itemsCart.length; i++){
            System.out.print("Enter the price for item " + (i+1) + ": ");
            itemsCart[i] = scan.nextInt();
        }
        double total=0.00;
        for(int i = 0; i < itemsCart.length; i++){

            //System.out.println(itemsCart[i]);
            total=total+itemsCart[i];
            os.setTotalAmt(total);

        }
        System.out.println("Net Amount is:"+os.getTotalAmt());
    }
}
