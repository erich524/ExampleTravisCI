

import static org.junit.Assert.*;

import org.junit.Test;

public class testHomework01 {
	int[] a = {0,1,2,3};

	@Test
	public void testFindLast() {
	assertEquals(Homework01.findLast(a,3), 3);
	}

}
