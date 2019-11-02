package com.techelevator;

import com.techelevator.CigarParty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class CigarPartyTest {
	CigarParty test = new CigarParty();

	@Before
	public void setup() {
		test = new CigarParty();
	}

	@Test
	public void cigars_more_than_39_always() {
		boolean returnValue;

		returnValue = test.haveParty(32, false);

		Assert.assertEquals("For the party to be successful, it has to have 40+ cigars", false, returnValue);

	}

	@Test
	public void cigars_less_than_61_on_weekdays() {
		boolean returnValue;

		returnValue = test.haveParty(100, false);
		Assert.assertEquals("For the party to be successful on weeknights, it has to have less than 61 cigars", false,
				returnValue);
	}

	@Test
	public void unlimited_cigars_on_weekend() {
		boolean returnValue;
		returnValue = test.haveParty(100, true);
		Assert.assertEquals("Any cigars are allowed on weekdays, so long as it is more than 39", true, returnValue);
	}

}
