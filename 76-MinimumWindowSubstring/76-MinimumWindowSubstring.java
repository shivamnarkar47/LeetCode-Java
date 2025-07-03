// Last updated: 04/07/2025, 02:18:50
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0)
			return "";

		Map<Character, Integer> tMap = new HashMap<>();

		for (char c : t.toCharArray()) {
			tMap.put(c, tMap.getOrDefault(c, 0) + 1);
		}

		int required = tMap.size();
		int left = 0, right = 0, formed = 0;
		Map<Character, Integer> windowCounts = new HashMap<>();

		int[] ans = { -1, 0, 0 };

		while (right < s.length()) {
			char c = s.charAt(right);
			windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);
			if (tMap.containsKey(c) && windowCounts.get(c).intValue() == tMap.get(c).intValue()) {
				formed++;
			}

			while (left <= right && formed == required) {
				if (ans[0] == -1 || right - left + 1 < ans[0]) {
					ans[0] = right - left + 1;
					ans[1] = left;
					ans[2] = right;
				}

				char l = s.charAt(left);
				windowCounts.put(l, windowCounts.get(l)-1);

				if (tMap.containsKey(l) && windowCounts.get(l).intValue() < tMap.get(l).intValue()) {
					formed--;
				}

				left++;
			}

			right++;
		}

		return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}