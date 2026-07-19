class Solution {

    public int maxVowels(String s, int k) {

        int left = 0;
        int count = 0;
        int max = 0;

        // First window
        for (int right = 0; right < k; right++) {
            if (isVowel(s.charAt(right))) {
                count++;
            }
        }

        max = count;

        // Sliding window
        for (int right = k; right < s.length(); right++) {

            if (isVowel(s.charAt(left))) {
                count--;
            }
            left++;

            if (isVowel(s.charAt(right))) {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}