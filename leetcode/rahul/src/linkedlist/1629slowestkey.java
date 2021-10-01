class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
       char ch = keysPressed.charAt(0);
        int lon = releaseTimes[0];
        for(int i = 1; i < releaseTimes.length; i++) {
        	int val = releaseTimes[i] - releaseTimes[i-1];
        	if(val > lon) {
        		ch = keysPressed.charAt(i);
                lon = val;
        	}else if(val == lon) {
        		if(keysPressed.charAt(i) > ch)
        			ch = keysPressed.charAt(i);
        	}
        }
        return ch;
        
    }
}
