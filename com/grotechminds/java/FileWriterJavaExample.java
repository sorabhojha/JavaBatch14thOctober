package com.grotechminds.java;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileWriterJavaExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		/*
		 * BufferedReader rd1 = null; try { rd1 = new BufferedReader(new
		 * FileReader("D:\\sample.txt")); String contentLine = rd1.readLine();
		 * while(contentLine != null) { System.out.println(contentLine); contentLine =
		 * rd1.readLine(); } } catch(IOException ioe) { ioe.printStackTrace(); }
		 */
		
		FileOutputStream fout = new FileOutputStream("D:\\sample.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		String text = "My Name is Rohith";
		byte b[] = text.getBytes();
		
		try {
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
