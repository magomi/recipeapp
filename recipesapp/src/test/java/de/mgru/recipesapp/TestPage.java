package de.mgru.recipesapp;

import org.apache.wicket.util.tester.WicketTester;
import org.codefromhell.recipesapp.Application;
import org.junit.Before;
import org.junit.Test;

import org.codefromhell.recipesapp.HomePage;

/**
 * @author Richard Wilkinson - richard.wilkinson@jweekend.com
 *
 */
public class TestPage {
	
	private WicketTester tester;
	
	@Before
	public void setUp()
	{
		tester = new WicketTester(new Application());
	}
	
	@Test
	public void testPage()
	{
		tester.startPage(HomePage.class);
		
		tester.assertRenderedPage(HomePage.class);
		
	}

}
