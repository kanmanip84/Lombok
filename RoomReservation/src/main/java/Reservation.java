import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Reservation {
    private String room;
    private LocalDate startDate;
    private LocalDate endDate;
    private String guestName;
}


