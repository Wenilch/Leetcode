import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTest {
	@Test
	public void findMedianSortedArrays() {
		Application application = new Application();

		Assertions.assertEquals(application.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 2.0d);
		Assertions.assertEquals(application.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 2.5d);
		Assertions.assertEquals(application.findMedianSortedArrays(new int[]{}, new int[]{1}), 1.0d);
		Assertions.assertEquals(application.findMedianSortedArrays(new int[]{2}, new int[]{}), 2.0d);

	}
}
