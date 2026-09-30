

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
		int ans = 0;
		
		for (int i=0; i<=n; i++) {
		    
		    if (i==n) {
		        ans = ans ^ i;
		    }
		    
		    else {
		        ans = ans ^ nums[i] ^ i;
		    }
            
		}

        return ans;
    }
}
