import java.time.LocalDate;

public class MainReservation {
    public static void main(String[] args) {
     HotelDetails  hd=new HotelDetails("Grand Hotel","1 Main St",5);
     System.out.println("Hotel details :");
     System.out.println("---------------");
     System.out.println("Hotel Name    :"+hd.getName());
     System.out.println("Address       :"+hd.getAddress());
     System.out.println("Rating        :"+hd.getStarRating());
     RoomReservation rr=new  RoomReservation ("101", 2, true);

     Reservation reservation = new Reservation("room", LocalDate.of(2022, 10, 20),LocalDate.of(2022, 10, 22),"John");


     System.out.println("Reservation details :");
     System.out.println("---------------------");
     System.out.println("Room No              "+rr.getRoomNumber());
     System.out.println("QuestName            "+reservation.getGuestName());
     System.out.println("Capacity             "+rr.getCapacity());
     System.out.println("FromDate             "+reservation.getStartDate());
     System.out.println("ToDate               "+reservation.getEndDate());


    }
}
