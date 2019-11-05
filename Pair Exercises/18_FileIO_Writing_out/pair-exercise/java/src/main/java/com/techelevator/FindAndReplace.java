package com.techelevator;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// /Users/gracenovacek/workspace/gracenovacek-java-green/module-1/17_FileIO_Reading_in/student-exercise/java/alices_adventures_in_wonderland.txt

public class FindAndReplace {
//	
//	private static File getFile(String filePath) throws Exception {
//		File file = null;
//		file = new File(filePath);
//		if (!file.exists()) {
//			System.out.println("That file does not exist!");
//			file = null;
//		} else if (!file.isFile()) {
//			System.out.println("The path provided is not a file: " + file);
//			file = null;
//		}
//		return file;
//	}
//
//	public static void main(String[] args) {
//
//		Scanner scan = new Scanner(System.in);
//		System.out.print("What is the file that should be searched?");
//		String filePath = scan.nextLine();
//
//		System.out.println("What is the search word you are looking for?");
//		String searchWord = scan.nextLine();
//
//		System.out.println("What is the word to replace the search word with?");
//		String replaceWord = scan.nextLine();
//
//		try {
//			File file = getFile(filePath);
//			try (Scanner fileTxt = new Scanner(file)) {
//				while(fileTxt.hasNextLine()) {
//					String line = fileTxt.nextLine();
//					// stuck here 
////				String fileName = "Copy of Alice in Wonderland"; 
////				File newFile = new File(fileName);	
//				
//// take fileTxt and copy it to Copy of Alice
//				
//// go through that copy and find replace: 
////				while (fileTxt.hasNextLine()) {
////					String line = fileTxt.nextLine();
////						if (line.contains(searchWord)) {
////							line.replace(searchWord, replaceWord); 
////						}
//		
//		
////		
////		try {
////			if(! newFile.createNewFile()) {
////				System.out.println("Unable to create the new file.");
////				System.exit(1);
////			}
////		} catch (IOException e) {
////			System.out.println("Unable to make the new file.");
////			System.exit(1);
////		}
////		
////		try(PrintWriter writer = new PrintWriter(new FileWriter(newFile))) { 
//////			writer.println();
////		}catch(IOException e) {
////			System.out.println("Unable to write our message to the file");
////			System.exit(1);
////		}
////		
////// need to write this to a new file and not override the source file ... 
////					}
////					
////				}
////			} catch (Exception e) {
////				System.out.println(e.getMessage());
////				System.exit(1);
////			}
////		} 
//	}
//}
}