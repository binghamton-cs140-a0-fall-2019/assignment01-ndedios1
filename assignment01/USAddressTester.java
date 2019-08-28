package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
  public static void main(String[] args) {
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");
      StreetUSAddress home1 = new StreetUSAddress("123 Sesame Street", "456 Dream Lane", "Manhattan", "NY","98765");
      StreetUSAddress home2 = new StreetUSAddress("4400 Vestal Parkway E", "", "Binghamton", "NY", "13901");
      System.out.println(home1);
      System.out.println(home2);

      StreetUSAddress home12 = new StreetUSAddress("123 Sesame Street", "456 Dream Lane", "Manhattan", "NY","98765");
      StreetUSAddress home22 = new StreetUSAddress("4400 Vestal Parkway E", "", "Binghamton", "NY", "13901");
      output.println(home12);
      output.println(home22);

      //Copy all your lines above, add an extra "2" to every variable name
  		// and replace every System.out.print or System.out.println
  		// by output.print or output.println
  		} catch (FileNotFoundException e) {
  			e.printStackTrace();
  }

}
