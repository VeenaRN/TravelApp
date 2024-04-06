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
public class ParametersForMin {
	
	private SimpleOperations sim=null;
	private int x[]=null;
	private int expNum=0;
	
	public ParametersForMin(int[] x, int expNum) {
		super();
		this.x = x;
		this.expNum = expNum;
	}
	
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][] {{new int[] {10,2,4,2,-2},-2},{new int[] {-12,-9,-10},-12}});
	}
	
	@Before
	public void init()
	{
	sim = new SimpleOperations();
	}
	@Test
	public void testFindMin()
	{
		int expected=expNum;
		int actual=sim.FindMin(x);
		
		Assert.assertEquals(expected, actual);
	}

	}
