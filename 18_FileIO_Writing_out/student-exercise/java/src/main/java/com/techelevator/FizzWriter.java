package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {
		
		File newFile = new File("/Users/gracenovacek/workspace/gracenovacek-java-green/module-1/18_FileIO_Writing_out/student-exercise/java/","FizzBuzz.txt");
		
		
		String messageToWriteToFile = ""; 
		
		try(PrintWriter writer = new PrintWriter(newFile)){
			
			
			for(int i =1; i <301; i++) {
				if(i >= 1 && i <=300) {
				if (i % 3 == 0 && i % 5 == 0 || Integer.toString(i).contains("3") && Integer.toString(i).contains("5")) {
					messageToWriteToFile = "FizzBuzz";
				} else if (i % 3 == 0 || Integer.toString(i).contains("3")){
					messageToWriteToFile = "Fizz";
				} else if (i % 5 == 0 || Integer.toString(i).contains("5")){
					messageToWriteToFile = "Buzz"; 
				} else {
					messageToWriteToFile = Integer.toString(i); 
				}
			}
			
			writer.println(messageToWriteToFile);
			
		}
	
			}catch (FileNotFoundException e) {
				System.out.println("");
				System.exit(1);
			}
			
		}
	}	
