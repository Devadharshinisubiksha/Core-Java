package com.mav.MavenProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertClass {
	@Test
	public void TestAssert()
	{
		String s1="Indian";
		String s2="Indian";
		String s3="Indian";
		String s4="null";
		int a=1;
		int b=2;
		int[]arr1= {5,6,7};
		int[]arr2= {5,6,7};
		assertEquals(s1,s2);
		assertTrue(a<b);
		assertFalse(a>b);
		assertNotNull(s1);
		assertNull(s4);
		assertSame(s1,s2);
		assertNotSame(s1,s3);
	}
}


