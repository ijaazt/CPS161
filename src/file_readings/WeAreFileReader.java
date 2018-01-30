package file_readings;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;

public class WeAreFileReader {
	public static void main(String[] args) {
		 System.out.println(new File(".").getAbsolutePath());
		try {
			Scanner fileReader = new Scanner(new FileInputStream("myWorks.txt"));
			if( fileReader.hasNextLine()) {
				char myGrade = fileReader.findInLine(".").charAt(0);
				System.out.printf("My grade is an %c", myGrade);	
			}
			fileReader.close();
		} catch(FileNotFoundException e) {
			System.out.println("We encountered an exception. We couldn't find your file.");
			System.exit(0);
		}
		

//		public static int absValue(int input) {
//			if(input < 0)
//				val = -val 
//		}
	}
}