package jUnitPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {
	jUnitFunctions t = new jUnitFunctions();
	@Test
	public void test() {
		assertEquals( "Regular integer should work", t.AddNumbers(4,5),9);
	}
}