import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
	public Date() {
	    LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
	    String LocalInformation = myDateObj.format(myFormatObj);
	    System.out.println("\n\nHello, today is " + LocalInformation + " please continue below."); // Display the current date"
	}
	
}
