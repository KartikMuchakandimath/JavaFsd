package filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filetest {
private static final String filepath = "D:\\Basics\\testfile.txt";

public static void main(String[] args) {
	
	
	testinput();
	testout();
}

private static void testinput() {
	try {
		FileOutputStream fs = new FileOutputStream(filepath);
		String s="hello world";
		fs.write(s.getBytes());
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

private static void testout() {
     try {
    	// String filepath;
		FileInputStream fis = new FileInputStream(filepath);
		
		int i=0;
		while((i=fis.read() )!= -1)
			System.out.print((char)i);
		
     }
     catch(Exception e) {
    	 System.out.println("error");
     }
}
}
