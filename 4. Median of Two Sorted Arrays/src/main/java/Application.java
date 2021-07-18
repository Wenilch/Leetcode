public class Application {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int mergeArraySize = nums1.length + nums2.length;
		int[] merge = new int[mergeArraySize];
		int indexNums1 = 0;
		int indexNums2 = 0;
		for (int i = 0; i < mergeArraySize; i++) {
			if (indexNums1 == nums1.length) {
				merge[i] = nums2[indexNums2];
				indexNums2++;
			} else if (indexNums2 == nums2.length) {
				merge[i] = nums1[indexNums1];
				indexNums1++;
			} else if (nums1[indexNums1] > nums2[indexNums2]) {
				merge[i] = nums2[indexNums2];
				indexNums2++;
			} else if (nums1[indexNums1] < nums2[indexNums2]) {
				merge[i] = nums1[indexNums1];
				indexNums1++;
			} else {
				merge[i] = nums1[indexNums1];
				merge[i + 1] = nums2[indexNums2];
				indexNums1++;
				indexNums2++;
				i++;
			}
		}

		if (mergeArraySize % 2 == 0) {
			int a = merge[(mergeArraySize - 1) / 2];
			int b = merge[(mergeArraySize) / 2];

			return (a + b) / 2.0;
		} else {
			return merge[(mergeArraySize - 1) / 2];
		}
	}
}
