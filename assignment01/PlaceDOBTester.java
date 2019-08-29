package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
  public static void main(String[] args) {
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
      DateAndPlaceOfBirth val1 = new DateAndPlaceOfBirth(2000,07,10,"West Islip", "NY", "US");
      DateAndPlaceOfBirth val2 = new DateAndPlaceOfBirth(2000,07,10, "Las Vegas", "NV", "US");
      DateAndPlaceOfBirth val3 = new DateAndPlaceOfBirth(2003,07,10, "New Orleans", "LA", "US");
      DateAndPlaceOfBirth val4 = new DateAndPlaceOfBirth(2012, 11, 11, "Paris", "France");
      DateAndPlaceOfBirth val5 = new DateAndPlaceOfBirth(2010, 10, 10, "London", "United Kingdom");
      System.out.println(val1);
      System.out.println(val2);
      System.out.println(val3);
      System.out.println(val4);
      System.out.println(val5);
      DateAndPlaceOfBirth val12 = new DateAndPlaceOfBirth(2000,07,10,"West Islip", "NY", "US");
      DateAndPlaceOfBirth val22 = new DateAndPlaceOfBirth(2000,07,10, "Las Vegas", "NV", "US");
      DateAndPlaceOfBirth val32 = new DateAndPlaceOfBirth(2003,07,10, "New Orleans", "LA", "US");
      DateAndPlaceOfBirth val42 = new DateAndPlaceOfBirth(2012, 11, 11, "Paris", "France");
      DateAndPlaceOfBirth val52 = new DateAndPlaceOfBirth(2010, 10, 10, "London", "United Kingdom");
      output.println(val12);
      output.println(val22);
      output.println(val32);
      output.println(val42);
      output.println(val52);

      //TEST 1: VAl 1
      System.out.println(val1.olderThan(val2));
      System.out.println(val1.olderThan(val3));
      System.out.println(val1.olderThan(val4));
      System.out.println(val1.olderThan(val5));
      output.println(val1.olderThan(val2)); //false
      output.println(val1.olderThan(val3)); //true
      output.println(val1.olderThan(val4)); //true
      output.println(val1.olderThan(val5)); //true

      System.out.println(val1.youngerThan(val2));
      System.out.println(val1.youngerThan(val3));
      System.out.println(val1.youngerThan(val4));
      System.out.println(val1.youngerThan(val5));
      output.println(val1.youngerThan(val2)); //false
      output.println(val1.youngerThan(val3)); //false
      output.println(val1.youngerThan(val4)); //false
      output.println(val1.youngerThan(val5)); //false

      System.out.println(val1.hasSameBirthDateAs(val2));
      System.out.println(val1.hasSameBirthDateAs(val3));
      System.out.println(val1.hasSameBirthDateAs(val4));
      System.out.println(val1.hasSameBirthDateAs(val5));
      output.println(val1.hasSameBirthDateAs(val2)); //true
      output.println(val1.hasSameBirthDateAs(val3)); //false
      output.println(val1.hasSameBirthDateAs(val4)); //false
      output.println(val1.hasSameBirthDateAs(val5)); //false

      System.out.println(val1.hasSameBirthDayAs(val2));
      System.out.println(val1.hasSameBirthDayAs(val3));
      System.out.println(val1.hasSameBirthDayAs(val4));
      System.out.println(val1.hasSameBirthDayAs(val5));
      output.println(val1.hasSameBirthDayAs(val2)); //true
      output.println(val1.hasSameBirthDayAs(val3)); //true
      output.println(val1.hasSameBirthDayAs(val4)); //false
      output.println(val1.hasSameBirthDayAs(val5)); //false
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
