package week3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

public class Week3Test {

	// TODO: Viết 5 testcase cho phương thức max()
	@Test
	public void testMax() {
		assertEquals(6, Week3.max(5, 6));
		assertEquals(0, Week3.max(0, 0));
		assertEquals(999, Week3.max(45, 999));
		assertEquals(-4, Week3.max(-12, -4));
		assertEquals(3, Week3.max(-123, 3));
	}

	// TODO: Viết 5 testcase cho phương thức minOfArray()
	@Test
	public void testMinOfArray() {
		assertEquals(2, Week3.minOfArray(new int[] { 2, 3, 4, 5, 6 }));
		assertEquals(0, Week3.minOfArray(new int[] { 0, 3, 4, 5, 6 }));
		assertEquals(-2, Week3.minOfArray(new int[] { -1, -2, 0, 1, 2 }));
		assertEquals(1, Week3.minOfArray(new int[] { 1, 1, 1, 1, 1, 1, 1, 1 }));
		assertEquals(0, Week3.minOfArray(new int[] { 0, 9999, 0, 9999 }));
		assertEquals(0, Week3.minOfArray(new int[] { 0, 0, 0, 0, 0 }));

	}

	// TODO: Viết 5 testcase cho phương thức calculateBMI()
	@Test
	public void testBMI() {
		assertEquals("Thieu can", Week3.calculateBMI(1, 1));
		assertEquals("Binh thuong", Week3.calculateBMI(60, 1.7));
		assertEquals("Thua can", Week3.calculateBMI(69, 1.7));
		assertEquals("Beo phi", Week3.calculateBMI(100, 1.6));
		assertEquals("Beo phi", Week3.calculateBMI(9999, 9));
	}
}
