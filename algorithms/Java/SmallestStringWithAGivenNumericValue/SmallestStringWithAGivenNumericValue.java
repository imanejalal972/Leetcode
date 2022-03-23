class Solution {
    public String getSmallestString(int n, int k) {
        
        char[] output = new char[n];
        
        for (int i = 0; i < n; i++) {
            output[i] = 'a';
            k--;
        }
        
        n = n - 1;
        
        while (k > 0) {
            if (k > 25) {
                output[n] = 'z';
                k = k - 25;
            }
            else {
                output[n] += k;
                break;
            }
            n--;
        }
        
        return String.valueOf(output);
    }
}