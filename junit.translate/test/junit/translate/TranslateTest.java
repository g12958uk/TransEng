package junit.translate;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class TranslateTest {

	@Test
	public void three•Ô‚·() {
		Translate trans = new Translate();
		String expected = "three";
		String actual = trans.translateEng(3);
		assertThat(actual, is(expected));
	}

}
