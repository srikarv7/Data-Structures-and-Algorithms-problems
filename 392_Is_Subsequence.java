class Solution {
    public boolean isSubsequence(String s, String t) {

        char[] sub = s.toCharArray();
        char[] big = t.toCharArray();

        int p1 = 0;
        int p2 = 0;

        while (p2 <= big.length - 1 && p1 < sub.length) {
            if (sub[p1] == big[p2]) {
                p1++;
                p2++;
            } else {
                p2++;
            }
        }

        if (p1 == sub.length) {
            return true;
        } else {
            return false;
        }

    }
}