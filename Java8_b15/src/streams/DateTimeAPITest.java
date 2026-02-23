package streams;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

public class DateTimeAPITest {
public static void main(String[] args) {
	Date date=new Date();
	System.out.println(date);
	
	SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
	System.out.println(sdf.format(date));
	
   LocalDate id	=LocalDate.now();
   System.out.println(id);
   
   LocalTime it=LocalTime.now();
   System.out.println(it);
   
   LocalDateTime ldt=LocalDateTime.now();
   System.out.println(ldt);
   
   Set<String> zones=ZoneId.getAvailableZoneIds();
   zones.stream().forEach(System.out::println);
   //System.out.println(zones);
   
   LocalTime zonetime=LocalTime.now(ZoneId.of("US/Pacific"));
   System.out.println(zonetime);
}
}
