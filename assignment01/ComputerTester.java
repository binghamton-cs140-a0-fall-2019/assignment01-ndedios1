package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");
      //more than terrabyte, SSD
      Computer test1 = new Computer("HP", "Intel Core 7", 16,1200, true, 1000 );
      System.out.println(comp);
      //more than terrabyte, no SSD
      Computer test2 = new Computer("Macbook", "Intel Core 5", 16,1500,false, 900 );
      System.out.println(comp);
      //less than terrabyte, SSD
      Computer test3 = new Computer("Chromebook", "Intel Core 3", 16,999,true, 800 );
      System.out.println(comp);
      //less than terrabyte, no SSD
      Computer test1 = new Computer("Dell", "Intel Pentium", 16,800,false, 700 );
      System.out.println(comp);
    //Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
