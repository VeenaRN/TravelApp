package com.testing;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.development.SimpleOperations;



public class SimpleTestings {
	
	private SimpleOperations sim=null;
	@BeforeEach
	public void initialize()
	{
		 sim=new SimpleOperations();
		 System.out.println("before method");
	}
	
	@AfterEach
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
	Assertions.assertEquals(expected, actuals);
	
	}
	
	@Test
	public void testAdditionForNEG_Values()
	{
	//SimpleOperations sim=new SimpleOperations();
	int expected=-30;
	int actuals=sim.Addition(-10, -20);
	Assertions.assertEquals(expected, actuals);
	
	}
	
	@Test
	public void testAdditionForPOS_NEG_Values()
	{
	//SimpleOperations sim=new SimpleOperations();
	int expected=10;
	int actuals=sim.Addition(-10, 20);
	Assertions.assertEquals(expected, actuals);
	
	}
	@Test
	public void testFindMin()
	{
		//SimpleOperations sim=new SimpleOperations();
		int actuals=sim.FindMin(new int[] {10,2,3,1,2});
		int expected =1;
		Assertions.assertEquals(expected, actuals);
	}
	@Test
	public void testReverse()
	{
		String expect="aneev";
		String actual=sim.reverseWord("veena");
		//System.out.println(actual);
		Assertions.assertTrue(expect.equals(actual));
	}
	@Test
	public void testReverse1()
	{
		String expect="aneeL";
		String actual=sim.reverseWord("veena");
		//System.out.println(actual);
		Assertions.assertFalse(expect.equals(actual));
	}
	}
