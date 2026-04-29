class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countMap = new HashMap<>();

        // 2. Count frequencies in the first string
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // 3. Decrement frequencies based on the second string
        for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c)) {
                return false; // Character not in original string
            }
            countMap.put(c, countMap.get(c) - 1);
            if (countMap.get(c) < 0) {
                return false; // More occurrences in t than in s
            }
        }

        // 4. Verify all counts are zero (redundant if lengths are equal, but safe)
        for (int val : countMap.values()) {
            if (val != 0) return false;
        }

        return true;
    }
}
