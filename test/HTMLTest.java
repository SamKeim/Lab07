import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HTMLTest {

	@Test
	public void testContainsGTSymbol() {

		String HTML = "<b></b>";

		Assertions.assertTrue(Lab7Regex.validateHTML(HTML));

	}

	@Test
	public void testContainsLTSymbol() {

		String HTML = "<b</b";

		Assertions.assertFalse(Lab7Regex.validateHTML(HTML));

	}

	@Test
	public void testContainsAlphabetical() {

		String HTML = "<i></i>";

		Assertions.assertTrue(Lab7Regex.validateHTML(HTML));

	}

	@Test
	public void testNumber() {

		String HTML = "<h1></h1>";

		Assertions.assertTrue(Lab7Regex.validateHTML(HTML));

	}
	
	@Test
	public void testNoSpecialCharacters() {
		
		String HTML = "<b!></b!>";
		
		Assertions.assertFalse(Lab7Regex.validateHTML(HTML));

	}
	
}
