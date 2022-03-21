class Solution {
    public List<Integer> partitionLabels(String s) {
        
        if (s == null || s.length() == 0)
            return null;
        
        int[] last_indices = new int[26];
        
        for (int i = 0; i < s.length(); ++i)
            last_indices[s.charAt(i) - 'a'] = i;
        
        
        int first = 0, last = 0;
        List<Integer> output_arr = new ArrayList();
        
        for (int i = 0; i < s.length(); ++i) {
            last = Math.max(last, last_indices[s.charAt(i) - 'a']);
            if (i == last) {
                output_arr.add(last - first + 1);
                first = last + 1;
            }
        }
        return output_arr;
    }
}