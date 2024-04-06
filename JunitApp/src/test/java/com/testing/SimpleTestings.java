package com.testing;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.development.SimpleOperations;

import junit.framework.Assert;

public class SimpleTestings {
	
	private SimpleOperations sim=null;
	@Before
	public void initialize()
	{
		 sim=new SimpleOperations();
		 System.out.println("before method");
	}
	
	@After
	public void endProcess()
	{
		sim=null;
		System.out.println("after method");
	}
	
	@Test
	public void testAdditionForPOS_Values()
	{
	//SimpleOperations sim=new SimpleOperations();
	int expected=30;
	int actuals=sim.Addition(10, 20);
	Assert.assertEquals(expected, actuals);
	
	}
	
	@Test
	public void testAdditionForNEG_Values()
	{
	//SimpleOperations sim=new SimpleOperations();
	int expected=-30;
	int actuals=sim.Addition(-10, -20);
	Assert.assertEquals(expected, actuals);
	
	}
	
	@Test
	public void testAdditionForPOS_NEG_Values()
	{
	//SimpleOperations sim=new SimpleOperations();
	int expected=10;
	int actuals=sim.Addition(-10, 20);
	Assert.assertEquals(expected, actuals);
	
	}
	@Test
	public void testFindMin()
	{
		//SimpleOperations sim=new SimpleOperations();
		int actuals=sim.FindMin(new int[] {10,2,3,1,2});
		int expected =1;
		Assert.assertEquals(expected, actuals);
	}
	@Test
	public void testReverse()
	{
		String expect="aneev";
		String actual=sim.reverseWord("veena");
		//System.out.println(actual);
		Assert.assertTrue("both are  same:",expect.equals(actual));
	}
	@Test
	public void testReverse1()
	{
		String expect="aneeL";
		String actual=sim.reverseWord("veena");
		//System.out.println(actual);
		Assert.assertFalse("both are  same:",expect.equals(actual));
	}
	
	
	
	
	
	
	
	
	
	

}
