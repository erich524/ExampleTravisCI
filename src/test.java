import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {
	int[] a = { 0, 1, 2, 3 };

	@Test
	void testFindLast() {
		assertEquals(homework01.findLast(a, 3), 3);
	}

}
