package com.grotechminds.java;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("D:\\sample.txt");
			out = new FileWriter("D:\\sample2.txt");
			
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
