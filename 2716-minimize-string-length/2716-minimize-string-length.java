class Solution {
    public int minimizedStringLength(String s) {
        int n = s.length();
        int[] arr = new int[26];
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            arr[c-'a']++;
        }
        int res = 0;
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                res++;
            }
        }
        return res;

    }
}