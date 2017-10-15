import static org.junit.Assert.*;

import org.junit.Test;


public class test {
 String newString = "";
	@Test
	public void test() {
		assertEquals("frab", reverseMe("barf"));
	}

	public String reverseMe(String string) {
		for (int i = string.length()-1; i >= 0; i--) {
			newString += string.charAt(i);
		}
		System.out.println(newString);
		return newString;
		
	}

}
