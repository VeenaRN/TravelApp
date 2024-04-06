package com.testing;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.development.SimpleOperations;

public class MiscTests {

	static SimpleOperations sim=null;
	
	@BeforeClass
	public static void init()
	{
		sim=new SimpleOperations();
	}
	@AfterClass
	public static void end()
	{
		sim=null;
	}
	@Test(expected=ArithmeticException.class)
	public void testDivide()
	{
		sim.Divide(10);
	}
	@Test
	public void testTime()
	{
	sim.TestTime();	
	}
	
	
}
