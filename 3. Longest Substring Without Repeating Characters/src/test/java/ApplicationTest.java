import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTest {
	@Test
	public void lengthOfLongestSubstring() {
		Application application = new Application();

		Assertions.assertEquals(application.lengthOfLongestSubstring("abcabcbb"), 3);
		Assertions.assertEquals(application.lengthOfLongestSubstring("bbbbb"), 1);
		Assertions.assertEquals(application.lengthOfLongestSubstring("pwwkew"), 3);
		Assertions.assertEquals(application.lengthOfLongestSubstring("dvdf"), 3);
		Assertions.assertEquals(application.lengthOfLongestSubstring("aabaab!bb"), 3);
	}


}
