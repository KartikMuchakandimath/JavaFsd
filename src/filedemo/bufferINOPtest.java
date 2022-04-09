package filedemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferINOPtest {
	private static final String filepath = "D:\\Basics\\testfile1.txt";
	
	public static void main(String[] args) {
		testbufferin();
		testbufferout();
	}
	private static void testbufferout() {
		  try {
				FileInputStream fis = new FileInputStream(filepath);
				BufferedInputStream bin = new BufferedInputStream(fis);
				int i=0;
				while((i=bin.read()) != -1)
					System.out.print((char)i);
				
		     }
		     catch(Exception e) {
		    	 System.out.println("error");
		     }		
	}
	private static void testbufferin() {
		try {
			FileOutputStream fs = new FileOutputStream(filepath);
			BufferedOutputStream bos = new BufferedOutputStream(fs);
			String s="hello world its txt2";
			byte[] b = s.getBytes();
			bos.write(b);
			bos.flush();
			bos.close();
			fs.close();
			System.out.println("end");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}		
	}


