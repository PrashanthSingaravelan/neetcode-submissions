

class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> queue1 = new PriorityQueue<>(Collections.reverseOrder());
	    
	    for (int item : stones){
	        queue1.add(item);
	    }
	    
	    while (queue1.size() > 1) {
	        
	        int top_first  = queue1.poll(); 
	        int top_second = queue1.poll();
	        
	        int difference = top_first - top_second;
	        
	        if ( difference > 0) {
	            queue1.add(difference);
	        }
	        
	    }
	    
        if (queue1.size() == 0) {
	        return 0;
	    }
	    
	    else {
	        return queue1.poll();
	    }
        
    }
}
