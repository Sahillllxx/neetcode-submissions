class Solution {
    public String minWindow(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        int j = 0;

        int required = t.length();
        int formed = 0;

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (j < s.length()) {

            char ch = s.charAt(j);

            if (map.containsKey(ch)) {

                if (map.get(ch) > 0) {
                    formed++;
                }

                map.put(ch, map.get(ch) - 1);
            }

            j++;

            while (formed == required) {

                if (j - i < minLength) {
                    minLength = j - i;
                    start = i;
                }

                char left = s.charAt(i);

                if (map.containsKey(left)) {

                    map.put(left, map.get(left) + 1);

                    if (map.get(left) > 0) {
                        formed--;
                    }
                }

                i++;
            }
        }

        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }
}