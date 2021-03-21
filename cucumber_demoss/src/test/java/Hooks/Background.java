package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Background {
	@Before
	public void beforeRun()
	{
		System.out.println("---------------");
	}
	 
	@After
	public void afterRun()
	{
		System.out.println("---------------");
	}
}
