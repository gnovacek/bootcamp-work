package com.techelevator;

import org.junit.Test;
import org.junit.Assert;

public class KataNumbersToWordsTest {
	 @Test
	    public void one_didgit_numbers_convert_to_the_correct_word_one() {
	        final int oneInt = 1;
	        final String expectedWord = "one";
	        
	        String output = KataNumbersToWords.convertToWord(oneInt);
	        
	        Assert.assertEquals("Int 1 converts to 'one'", expectedWord, output);
	    }
	    
	    @Test
	    public void int_17_converts_to_the_correct_word_seventeen() {
	        final int seventeenInt = 17;
	        final String expectedWord = "seventeen";
	        
	        String output = KataNumbersToWords.convertToWord(seventeenInt);
	        
	        Assert.assertEquals("Int 17 converts to 'seventeen'", expectedWord, output);
	    }
	    
	    @Test
	    public void int_24_converts_to_word() {
	        final int twentyfourInt = 24;
	        final String expectedWord = "twenty four";
	        
	        String output = KataNumbersToWords.convertToWord(twentyfourInt);
	        
	        Assert.assertEquals("Int 24 converts to 'twenty four'", expectedWord, output);
	    }
	    
	    @Test
	    public void int_38_converts_to_word() {
	        final int thirtyeightInt = 38;
	        final String expectedWord = "thirty eight";
	        
	        String output = KataNumbersToWords.convertToWord(thirtyeightInt);
	        
	        Assert.assertEquals("Int 38 converts to 'thirty eight'", expectedWord, output);
	    }
	    
	    @Test
	    public void int_43_converts_to_word() {
	        final int fortythreeInt = 43;
	        final String expectedWord = "forty three";
	        
	        String output = KataNumbersToWords.convertToWord(fortythreeInt);
	        
	        Assert.assertEquals("Int 43 converts to 'forty three'", expectedWord, output);
	    }
	    
	    @Test
	    public void int_55_converts_to_word() {
	        final int fiftyfiveInt = 55;
	        final String expectedWord = "fifty five";
	        
	        String output = KataNumbersToWords.convertToWord(fiftyfiveInt);
	        
	        Assert.assertEquals("Int 55 converts to 'fifty five'", expectedWord, output);
	    }
	    public void int_189_converts_to_word() {
	        final int oneEightyNineInt = 189;
	        final String expectedWord = "one hundred eighty nine";

	        String output = KataNumbersToWords.convertToWord(oneEightyNineInt);

	        Assert.assertEquals("Int 189 converts to 'one hundred eighty nine'", expectedWord, output);
	    }
	    
	    @Test
	    public void int_193_converts_to_word() {
	        final int oneNinetyThreeInt = 193;
	        final String expectedWord = "one hundred ninety three";

	        String output = KataNumbersToWords.convertToWord(oneNinetyThreeInt);

	        Assert.assertEquals("Int 193 converts to 'one hundred ninety three'", expectedWord, output);
	    }
	    
	    @Test
	    public void int_1622_converts_to_word() {
	        final int oneSixTwoTwoInt = 1622;
	        final String expectedWord = "one thousand six hundred twenty two";

	        String output = KataNumbersToWords.convertToWord(oneSixTwoTwoInt);

	        Assert.assertEquals("Int 1622 converts to 'one thousand six hundred twenty two'", expectedWord, output);
	    }
	    
	    @Test 
	    public void int_7777_converts_to_word() {
	        final int sevens = 7777;
	        final String expectedWord = "seven thousand seven hundred seventy seven";

	        String output = KataNumbersToWords.convertToWord(sevens);

	        Assert.assertEquals("Int 7777 converts to 'seven thousand seven hundred seventy seven'", expectedWord, output);
	    }
	    @Test
	    public void int_91300_converts_to_word() {
	        final int ninetythouInt = 91300;
	        final String expectedWord = "ninety one thousand three hundred ";

	        String output = KataNumbersToWords.convertToWord(ninetythouInt);

	        Assert.assertEquals("Int 91300 converts to 'ninety one thousand three hundred'", expectedWord, output);
	    }
	    @Test
	    public void int_10168_converts_to_word() {
	        final int tenSixteenEightInt = 10168;
	        final String expectedWord = "ten thousand one hundred sixty eight";

	        String output = KataNumbersToWords.convertToWord(tenSixteenEightInt);

	        Assert.assertEquals("Int 10168 converts to 'ten thousand one hundred sixty eight'", expectedWord, output);
	    }
	    
	    @Test 
	    public void int_12555_converts_to_word() {
	        final int twelveFivesInt = 12555;
	        final String expectedWord = "twelve thousand five hundred fifty five";

	        String output = KataNumbersToWords.convertToWord(twelveFivesInt);

	        Assert.assertEquals("Int 12555 converts to 'twelve thousand five hundred fifty five'", expectedWord, output);
	    }
}

