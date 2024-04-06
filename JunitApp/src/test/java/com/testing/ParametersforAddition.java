package com.testing;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.development.SimpleOperations;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class ParametersforAddition {

	private SimpleOperations sim = null;
	private int fNumber, sNumber, expNumber;
	
	public ParametersforAddition(int fNumber, int sNumber, int expNumber) {
		super();
		this.fNumber = fNumber;
		this.sNumber = sNumber;
		this.expNumber = expNumber;
		System.out.println("Cons");
	}
	
	
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][] {{10,20,30},{-10,-20,-30}, {10, -20, -10}});
	}
	
	@Before
	public void init()
	{
		sim = new SimpleOperations();
	}
	
	@Test
	public void testAddition()
	{
		int expected = expNumber;
		int actuals = sim.Addition(fNumber, sNumber);
		Assert.assertEquals(expected, actuals);
	}
}
