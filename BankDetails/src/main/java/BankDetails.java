import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class BankDetails {
    private String name;
    private String accno;
    private String acc_type;
    private long balance;
   //private long amt;

}


