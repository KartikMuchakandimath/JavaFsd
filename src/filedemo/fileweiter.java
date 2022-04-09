package filedemo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileweiter {

		private static final String filepath = "D:\\Basics\\testfile3.txt";
		
		public static void main(String[] args) {
			testwriter();
			testreader();
		}

		private static void testreader() {
		  try {
			FileReader fr = new FileReader(filepath);
			
			BufferedReader br = new BufferedReader(fr);
			int i= br.read();
			System.out.print((char)i);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}

		private static void testwriter() {
			 try {
					FileWriter fw = new FileWriter(filepath);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("Hello world using buffered writer");
					bw.close();
					System.out.println("done");
					
			     }
			     catch(Exception e) {
			    	 System.out.println("error");
			     }		
		}
		
			
		}

