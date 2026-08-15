class Solution {
    public int longestSubstring(String s, int k) {
        return longest(s,k,0,s.length());
    }
    public static int longest(String s, int k, int start, int end) {
		 if (end - start < k) return 0;
		 
		int[] freq = new int[26];
		for (int i = start; i < end; i++) {
			freq[s.charAt(i) - 'a']++;
		}

		boolean isvalid = true;
		for (int i = 0; i < 26; i++) {
			if (freq[i] > 0 && freq[i] < k) {
				isvalid = false;
				break;
			}
		}
		if (isvalid) {
			return end - start;
		}

		int maxLen = 0;
		int left = start;
		for (int right = start; right < end; right++) {
			if (freq[s.charAt(right) - 'a'] < k) { // if this character is poison yani it have freq<k then split
				maxLen = Math.max(maxLen, longest(s, k, left, right));
				
				left = right+1;

			}

		}
		maxLen = Math.max(maxLen, longest(s, k, left, end));

		return maxLen;
	}

}