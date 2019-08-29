package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
  public static void main(String[] args) {
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");
      DateAndPlaceOfBirth datebirth = new DateAndPlaceOfBirth(2000, 07, 10, "West Islip", "NY", "US");
      StreetUSAddress myaddress = new StreetUSAddress("140 CS Lane", "Vestal Parkway", "Binghamton", "NY", "13902");
      Person me = new Person("Nick", "De Dios", "123-45-6789", datebirth, myaddress);
      ComputerOwner owner = new ComputerOwner(me);

      Computer test1 = new Computer("HP", "Intel Core 7", 16,1200, true, 1000 );
      //more than terrabyte, no SSD
      Computer test2 = new Computer("Macbook", "Intel Core 5", 16,1500,false, 900 );
      //less than terrabyte, SSD
      Computer test3 = new Computer("Chromebook", "Intel Core 3", 16,999,true, 800 );
      //less than terrabyte, no SSD
      Computer test4 = new Computer("Dell", "Intel Pentium", 16,800,false, 700 );
      owner.addComputer(test1);
      owner.addComputer(test2);
      owner.addComputer(test3);
      owner.addComputer(test4);

      System.out.println(owner);
      output.println(owner);

      owner.removeComputer(1);
      owner.removeComputer(2);
      System.out.println(owner);
      output.println("\n");
      output.println(owner);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
