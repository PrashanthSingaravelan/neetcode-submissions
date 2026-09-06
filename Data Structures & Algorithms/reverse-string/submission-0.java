class Solution {
    public void reverseString(char[] s) {
        int front_ptr = 0;
        int rear_ptr = s.length-1;
    
        while (front_ptr < rear_ptr) {
            char temp = s[rear_ptr];
            s[rear_ptr] = s[front_ptr];
            s[front_ptr] = temp;

            front_ptr+=1;
            rear_ptr-=1;
        }
    }
}