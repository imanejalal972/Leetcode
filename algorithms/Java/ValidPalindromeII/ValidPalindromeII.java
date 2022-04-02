class Solution {
    char[] a;
    
    public boolean validPalindrome(String s) {
        a = s.toCharArray();
        int j = a.length-1;
        
        for(int i = 0; i < j; i++) {
            if(a[i] != a[j] ) { 
                return isPalindrome(i+1, j) || isPalindrome(i, j-1);
            }
            j--;
        }
        return true;
    }
    
    public boolean isPalindrome(int i, int j) {
        while (i < j) {
            if (a[i] != a[j]) 
                return false;
            i++; 
            j--;
        }
        return true;
    }
}