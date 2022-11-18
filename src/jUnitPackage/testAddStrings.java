package jUnitPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {
	jUnitFunctions t = new jUnitFunctions();
	@Test
	public void test() {
		assertEquals( "Regular string addition should work", t.AddStrings("a","b"),"ab");
	}
}
