package Z_JAVA_8_Features;

import java.time.LocalDate;
import java.time.LocalDateTime;

// LocalDate Methods
//  public static LocalDateNow(long);
//  public LocalDate plusYear(long);
//  public LocalDate plusMonths(long);
//  public LocalDate plusWeeks(long);
//  public LocalDate plusDays(long);
//  public LocalDate MinusYear(long);
//  public LocalDate MinusMonths(long);
//  public LocalDate MinusWeeks(long);
//  public LocalDate MinusDays(long);


public class I_New_Date_Time_API {
public static void main(String[] args) {
	LocalDateTime ld = LocalDateTime.now();
	LocalDateTime l = ld.plusDays(1000);
	System.out.println(l);
	
	
}
}
