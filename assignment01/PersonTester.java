package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
  public static void main(String[] args) {
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");
          DateAndPlaceOfBirth dateAndBirth = new DateAndPlaceOfBirth(2000, 07, 10, "NYC", "NY", "USA");
          StreetUSAddress place = new StreetUSAddress("123 Cayuga", "4400 Vestal Parkway", "Binghamton", "NY", "13901");
          Person human = new Person("Nick", "De Dios", "123-45-6789", dateAndBirth, place);
          System.out.println(human);
          Person human2 = new Person("Nick", "De Dios", "123-45-6789", dateAndBirth, place);
          output.println(human2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
