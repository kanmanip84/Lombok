import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SearchTrain {
    private String trainNumber;
    private String trainName;
    private String From;
    private String To;
    private String travelClass;
    private String quota;
}
