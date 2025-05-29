class Solution {
    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for (String ch : words) {
            if (ch.startsWith(pref)) {
                res++;
            }
        }
        return res;
    }
}