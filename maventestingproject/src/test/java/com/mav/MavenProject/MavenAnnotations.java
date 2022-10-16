package com.mav.MavenProject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MavenAnnotations {
	@Before
	public void BeforeTestMethod()
	{
		System.out.println("@Before-runBeforeTestMethod");
	}
	@After
	public void AfterTestMethod()
	{
		System.out.println("@Before-runAfterTestMethod");	
	}
	@BeforeClass
	public static void runOnceBeforeClass()
	{
		System.out.println("@BeforeClass-runOnceBeforeClass");
	}
	@AfterClass
	public static void runOnceAfterClass()
	{
		System.out.println("@AfterClass-runOnceAfterClass");
	}
	@org.junit.Ignore
	public void Ignore()
	{
		System.out.println("@Ignore-Ignoring of statement");
	}
	@Test(timeout=100)
	public void testTimeout1()
	{
		System.out.println("@Test(timeout=100)-Setting the time");
	}
	@Test(timeout=800)
	public void testTimeout()
	{
		System.out.println("@Test(timeout=800)-Setting the time");
	}
	@Test
	public void testmethod()
	{
		System.out.println("@Test-Test method @After");
	}
}
