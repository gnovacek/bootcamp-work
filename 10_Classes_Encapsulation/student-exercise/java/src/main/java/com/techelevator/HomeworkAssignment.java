package com.techelevator;

public class HomeworkAssignment {
	private int earnedMarks;
	private int possibleMarks; 
	private String submitterName;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks; 
	}
	
	public int getEarnedMarks() {
		return earnedMarks;
	}
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	} 
	
	public String getLetterGrade() {
		
		double percentGrade = ((double)earnedMarks / possibleMarks);
		
		if(percentGrade >= 0.9) {
			return "A"; 
		} else if (percentGrade >= 0.8 && percentGrade <= 0.89) {
			return "B"; 
		} else if (percentGrade >= 0.7 && percentGrade <= 0.79) {
			return "C"; 
		} else if (percentGrade >= 0.6 && percentGrade <= 0.69) {
			return "D"; 
		} else {
			return "F"; 
		}
	}
	
}
