import java.io.FileReader;
import java.io.IOException;

public class Disclaimer {
	public Disclaimer() {
		
	}
    public void unknown() {
        try {
            FileReader reader = new FileReader("disclaimer.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
