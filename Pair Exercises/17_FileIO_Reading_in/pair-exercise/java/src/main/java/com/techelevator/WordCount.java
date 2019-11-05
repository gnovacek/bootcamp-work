package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		System.out.println("Word Count Application \n******************\n");

		Scanner userInput = new Scanner(System.in);
		System.out.print("What is the file that should be searched?");
		String filePath = userInput.nextLine();

// /Users/gracenovacek/workspace/java-week-4-team-12/module-1/17_FileIO_Reading_in/pair-exercise/java/alices_adventures_in_wonderland.txt

		try {
			File file = getFile(filePath);
			try (Scanner fileTxt = new Scanner(file)) {

				// method that takes a single line of text and returns the word count

				int wordCount = 0;
				int sentenceCount = 0;
				while (fileTxt.hasNextLine()) {
					String line = fileTxt.nextLine();

					// count words
					String[] individualWordsArray = line.split(" ");
					wordCount += individualWordsArray.length;

					
					// count sentences
					if (line.contains(".")) {
						sentenceCount++; 
					} else if (line.contains("!")) {
						sentenceCount++; 
					} else if (line.contains("?")) {
						sentenceCount++; 
					}
					
				}

				System.out.println("Final word count: " + wordCount);
				System.out.println("Final sentence count: " + sentenceCount);

			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.exit(1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}

	}

	private static File getFile(String filePath) throws Exception {
		File file = null;
		file = new File(filePath);
		if (!file.exists()) {
			System.out.println("That file does not exist!");
			file = null;
		} else if (!file.isFile()) {
			System.out.println("The path provided is not a file: " + file);
			file = null;
		}
		return file;
	}
}
