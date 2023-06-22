import java.util.*;
import java.io.*;

// driver class
public class simple_file_handling {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name with extension");
		String file_name = sc.nextLine();
		System.out.println("Enter data to write in file");
		String data = sc.nextLine();
		// creation of file, writing on file
		try {
			// object of File
			File f = new File(file_name);
			// creating new file using File object
			f.createNewFile();
			// ********************************************************
			
			// object of FileWriter
			FileWriter fw = new FileWriter(file_name);
			// writing data on file
			fw.write(data);
			fw.close();
		} catch (Exception e) {
			System.out.println("Error is : "+e);
		}
		// **********************************************************
		
		// read from file
		try{
			// object of File
			File fr = new File(file_name);
			// creating scanner object which takes input from file
			Scanner file_content = new Scanner(fr);
			// storing single line from file in variable
			String file_data = file_content.nextLine();
			// printing data from file
			System.out.println(file_data);
			// closing scanner
			file_content.close();
		} catch(Exception e) {
		System.out.println("Error is : "+e);
		}
		// **********************************************************
		
		// delete a file
		try {
			System.out.println("Enter file name with extension to delete");
			String dlt_file = sc.nextLine();
			// object of File
			File f = new File(dlt_file);
			try{
				// deleting file
				f.delete();
			} catch(Exception e){
				System.out.println("Error is : "+e);
			}
		} catch (Exception e) {
			System.out.println("Error is : "+e);
		}
		sc.close();
	}
}
