import java.util.*;
import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CreateDates {

     public static void main(String[] args) {
     
         Date d1, d2, d3;

	 d1 = new Date();
	 System.out.println("Date 1:" + d1);

	// d2 = new Date(71, 7, 1, 7, 30);
	// System.out.println("Date 2:" + d2);
 	
	//d3 = new Date("April 3 1993 3:24 PM");
	// System.out.println("Date 3:" + d3);

        LocalDate localDate = LocalDate.of(2020, 10, 25);
	System.out.println("Date 4:" + localDate);



	//Parses the date
	LocalDate dt = LocalDate.parse("2020-10-25");
	System.out.println(dt);

	// Function call
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	System.out.println(formatter.format(dt));

	DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM dd YYYY");
	System.out.println(formatter2.format(dt));

     }
}
