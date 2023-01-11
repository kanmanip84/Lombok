import java.util.Scanner;
public class Booking {
    public static void main(String[] args) {

        System.out.println("Available cities");
        System.out.println("----------------");
        String[] strAr1 = new String[]{"chennai", "bangalore", "Hyderabad"};
        for (int i = 0; i < strAr1.length; i++) {
            System.out.println(strAr1[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the city");
        System.out.println("----------------");
        TicketBooking tb=new TicketBooking();
        String a = sc.next();
        tb.setCityName(a);

        System.out.println("Available Theaters");
        System.out.println("----------------");
        String[] strAr2 = new String[]{"Rohini", "Sona", "Meena", "Inox"};
        for (int i = 0; i < strAr2.length; i++) {
            System.out.println(strAr2[i]);
        }
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Select the Theater");
        System.out.println("----------------");
        String b = sc.next();
        tb.setTheaterName(b);

        System.out.println("ShowTimes");
        System.out.println("----------------");
        String[] strAr3 = new String[]{"12:00pm", "3:00pm", "6:00pm", "10:00pm"};
        for (int i = 0; i < strAr3.length; i++) {
            System.out.println(strAr3[i]);
        }
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Select the Time");
        System.out.println("----------------");
        String c = sc.next();
        tb.setShowTime(c);

        int totalSeats = 100;
        System.out.println("Total no of Seats:" + totalSeats);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the no of seats to be booked:");
        int d = sc.nextInt();
        tb.setTotalSeat(d);

        System.out.println("YOUR TICKET IS BOOKED");

        System.out.println("Selected city is:" + tb.getCityName());
        System.out.println("Selected Theater is:" + tb.getTheaterName());
        System.out.println("Selected ShowTime is:" +tb.getShowTime());
        System.out.println("No of seats booked:" + tb.getTotalSeat());


    }
}
