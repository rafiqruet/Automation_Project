package com.usa.hooks;

import com.usa.basepage.SuperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends SuperClass{
	
	@Before
	public void setUp() {
		initialization();
	}
	@After
	public void tearDown() {
		driver.quit();
	}

}
