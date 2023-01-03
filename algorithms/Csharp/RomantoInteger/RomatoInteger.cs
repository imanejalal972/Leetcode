public class Solution {
    public int RomanToInt(string s) {
        int res = 0, i = 0;

        IDictionary<char, int> RomanToInteger = new Dictionary<char, int>();
        RomanToInteger.Add('M', 1000);
        RomanToInteger.Add('D', 500);
        RomanToInteger.Add('C', 100);
        RomanToInteger.Add('L', 50);
        RomanToInteger.Add('X', 10);
        RomanToInteger.Add('V', 5);
        RomanToInteger.Add('I', 1);
        
        char[] ch = s.ToCharArray();

        while (i+1 < ch.Length) {
            if (RomanToInteger[ch[i]] < RomanToInteger[ch[i+1]]) 
                res -= RomanToInteger[ch[i]];
            else
                res += RomanToInteger[ch[i]];
            i++;
        }
        res += RomanToInteger[ch[i]];
        return res;
    }
}