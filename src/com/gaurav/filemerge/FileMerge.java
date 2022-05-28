package com.gaurav.filemerge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileMerge {
	
	public static File mergetIntoThird(File file1,  File file2) {
		File file = new File("D:\\java-concepts\\third.txt");
		try {
			PrintWriter writer = new PrintWriter(file);
			BufferedReader reader = new BufferedReader(new FileReader(file1));
			String line = reader.readLine();
			
			while(line != null) {
				writer.append(line);
				line = reader.readLine();
			}
			
			reader.close();
			reader = new BufferedReader(new FileReader(file2));
			line = reader.readLine();
			
			while(line != null) {
				writer.append(line);
				line = reader.readLine();
			}
			
			writer.close();
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return file;
	}
	public static void main(String[] args) {
		File file = mergetIntoThird(
				new File("\\java-concepts\\first.txt"),
				new File("\\java-concepts\\second.txt"));
		
		try {
			Scanner input = new Scanner(file);
			
			while(input.hasNext()) {
				System.out.println(input.nextLine());
			}
			
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
