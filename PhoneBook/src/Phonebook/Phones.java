package Phonebook;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Phones {
	public static void main(String[] args) {
		try {
//			System.out.println(file.exists());
//			file.canRead();
//			file.canWrite();
//			file.getName();
//			file.getAbsolutePath();
//			System.out.println(file.length());
			FileWriter filewriter=new FileWriter("C:\\Java\\newfile.txt");
			Scanner sc=new Scanner(System.in);
			filewriter.write("ahjhbd");
			filewriter.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
class sum{
	sum(){
	String name="harsha";
	String number="872819";
	String email="hlajhj";
	}
}
