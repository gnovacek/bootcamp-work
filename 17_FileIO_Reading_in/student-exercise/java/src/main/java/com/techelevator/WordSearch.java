package com.techelevator;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// /Users/gracenovacek/workspace/gracenovacek-java-green/module-1/17_FileIO_Reading_in/student-exercise/java/alices_adventures_in_wonderland.txt

public class WordSearch {

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

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("What is the file that should be searched?");
		String filePath = scan.nextLine();

		System.out.println("What is the search word you are looking for?");
		String searchWord = scan.nextLine();

		System.out.println("Should the search be case sensitive? (Y\\N)");
		String yesOrNo = scan.nextLine();

		boolean isCaseSensitive = false;

		if (yesOrNo.equalsIgnoreCase("y")) {
			isCaseSensitive = true;
		} else if (yesOrNo.equalsIgnoreCase("n")) {
			isCaseSensitive = false;
		}

		try {
			File file = getFile(filePath);
			try (Scanner fileTxt = new Scanner(file)) {
				int lineNum = 1;
				while (fileTxt.hasNextLine()) {
					String line = fileTxt.nextLine();

					if (isCaseSensitive) {
						if (line.contains(searchWord)) {
							System.out.println(lineNum + ") " + line);
						}

					} else if (!isCaseSensitive) {
						if (line.toLowerCase().contains(searchWord.toLowerCase())) {
							System.out.println(lineNum + ") " + line);
						}
					}
					lineNum++;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.exit(1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}
}
