import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	int[] a = { 0, 1, 2, 3 };

	@Test
	void testFindLast() {
		assertEquals(Homework1.findLast(a, 3), 3);
	}

}
