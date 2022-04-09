package filedemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class filewriterApp {
public static void main(String[] args) {
	String filepath = "D:\\Basics\\testfile3.txt";
	String greet=getuser();
	Writegreeting(filepath,greet);
}

private static void Writegreeting(String filepath, String greet) {
	try {
   FileWriter fw = new FileWriter(filepath,true);
   BufferedWriter bw= new BufferedWriter(fw);
   PrintWriter pw =new PrintWriter(bw);
   
   pw.append(greet);
   pw.close();
   bw.close();
   fw.close();
	}
	catch(Exception e) {
		
	}
   
   
	
}

private static String getuser() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name =sc.nextLine();
    String msg="Greetings!!... hi "+name+" welcome...";
    sc.close();
	return msg;
	
}


}
