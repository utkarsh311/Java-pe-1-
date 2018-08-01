package com.stackroute.test;

import static org.junit.Assert.*;
import com.stackroute.demo.TomJerry;
import org.junit.Test;

public class TestPe6 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		TomJerry junit=new TomJerry();
		String s=junit.result(27);
		assertEquals("tom",s);
		
	}

}
