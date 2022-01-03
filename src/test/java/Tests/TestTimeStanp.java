package Tests;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestTimeStanp {

	public static void main(String[] args) {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		   LocalDateTime now = LocalDateTime.now();
		   System.out.println(dtf.format(now));

	}

}
