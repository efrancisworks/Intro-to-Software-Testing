/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
import static org.junit.Assert.*;

import org.junit.Test;
public class DemoTest {
	@Test
	public void test_is_triangle_a() {
		assertFalse(Demo.isTriangle(0, 1, 1));
	}
	@Test
	public void test_is_triangle_b() {
		assertFalse(Demo.isTriangle(0, 0, 1));
	}
	@Test
	public void test_is_triangle_c() {
		assertFalse(Demo.isTriangle(0, -1, 1));
	}
	
	@Test
	public void test_is_triangle_d() {
		assertFalse(Demo.isTriangle(3, 4, 1));
	}
	@Test
	public void test_is_triangle_e() {
		assertFalse(Demo.isTriangle(-3, -4, -1));
	}
	@Test
	public void test_is_triangle_f() {
		assertFalse(Demo.isTriangle(-3, 4,-1));
	}
	@Test
	public void test_is_triangle_k() {
		assertFalse(Demo.isTriangle(6, 1, 7));
	}
	@Test
	public void test_is_triangle_k12() {
		assertFalse(Demo.isTriangle(5, 9, 3));
	}
	//-----Assert True----------
	@Test
	public void test_is_triangle_g() {
		assertTrue(Demo.isTriangle(5, 4, 6));
	}
	
	@Test
	public void test_is_triangle_h() {
		assertTrue(Demo.isTriangle(4, 4, 5));
	}
	@Test
	public void test_is_triangle_i() {
		assertFalse(Demo.isTriangle(13, 7, 5));
	}
	@Test
	public void test_is_triangle_j() {
		assertFalse(Demo.isTriangle(7, 13, 5));
	}
	@Test
	public void test_is_triangle_i1() {
		assertFalse(Demo.isTriangle(13, 5, 7));
	}
	
	
}

