class Solution {
    public int lengthOfLongestSubstring(String str1) {
        {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        
        int l_ptr = 0;
        int r_ptr = 0;
        int n = str1.length();
        int max_len = 0;
        int len = 0;
        
        while (r_ptr < n) {
            
            Character ch = str1.charAt(r_ptr);
            int ch_index = r_ptr;
            
            if (!(hashMap.containsKey(ch))) { // Not in hashMap just put the values
                hashMap.put(ch, ch_index);
                r_ptr+=1;
            }
            
            else { // Already characters are in hashMap
            
                int change_index = hashMap.get(ch);
                
                if (change_index >= l_ptr) {
                    l_ptr = change_index + 1;
                    hashMap.put(ch, r_ptr);
                    r_ptr+=1;
                }
                
                else {
                    hashMap.put(ch, r_ptr);
                    r_ptr+=1;
                }
            }
            
            len = r_ptr - l_ptr;  
            
            if (max_len < len) {
                max_len = len;
            }
        }

        return max_len;

    }
    }
}
