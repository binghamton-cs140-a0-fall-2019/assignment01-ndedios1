package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
  public static void main(String[] args) {
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

      SimpleDate date1 = new SimpleDate();
      SimpleDate date2 = new SimpleDate();
      SimpleDate date3 = new SimpleDate();
      SimpleDate date4 = new SimpleDate();
      SimpleDate date5 = new SimpleDate();

      var test1 = date1.of(2000,10,22);
      var test2 = date2.of(2001,10,22);
      var test3 = date3.of(2000,10,25);
      var test4 = date4.of(1999,10,22);
      var test5 = date5.of(2000,10,20);

      System.out.println(test1.before(test2)); //true
      System.out.println(test1.before(test3)); //true
      System.out.println(test1.before(test4)); //false
      System.out.println(test1.before(test5)); //false

      output.println(test1.before(test2)); //true
      output.println(test1.before(test3)); //true
      output.println(test1.before(test4)); //false
      output.println(test1.before(test5)); //false
    } catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
