import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//The purpose of this program is to give you the real time when you open the program.

public class Date {
	public Date() {
	    LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
	    String LocalInformation = myDateObj.format(myFormatObj);
	    System.out.println("\n\nHello, today is " + LocalInformation + " please continue below.\n"); 
	}
	
}
