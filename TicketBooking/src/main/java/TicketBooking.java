import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TicketBooking {
    private String cityName;

    private String theaterName;
    private String showTime;

    private int totalSeat;


}
