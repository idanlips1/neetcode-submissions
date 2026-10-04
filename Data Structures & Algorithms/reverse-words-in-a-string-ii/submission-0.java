class Solution {

    public void reverse(char[] s, int l, int r){
        while (l < r){
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
    }

    public void reverseEachWord(char[] s){
        int start = 0, end = 0;
        int n = s.length;

        while (start < n){
            while (end < n && s[end] != ' '){
                end++;
            }
            reverse(s,start,end - 1);
            start = end + 1;
            ++end;
        }
    }
    public void reverseWords(char[] s) {
        reverse(s,0, s.length - 1);

        reverseEachWord(s);
    }
}
