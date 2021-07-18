public class Application {
	public int lengthOfLongestSubstring(String s) {
		int maxSize = 0;
		StringBuilder substring = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char simbol = s.charAt(i);
			int index = substring.indexOf(String.valueOf(simbol));
			if (index == -1) {
				substring.append(simbol);
			} else {
				if (maxSize < substring.length()) {
					maxSize = substring.length();
				}

				substring.append(simbol);
				if (substring.length() > index + 1) {
					substring = new StringBuilder(substring.substring(index + 1));
				} else {
					substring = new StringBuilder();
				}
			}
		}

		if (substring.length() > 0 && maxSize < substring.length()) {
			maxSize = substring.length();
		}

		return maxSize;
	}
}
