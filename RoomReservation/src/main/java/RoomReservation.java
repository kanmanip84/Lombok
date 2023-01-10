import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class RoomReservation {

    private String roomNumber;
    private int capacity;
    private boolean isAvailable;
}
