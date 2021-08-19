// om namah shivay

class Solution {
public:
    int xorOperation(int n, int start) {
        vector<int> nums (n);
        int answ=0;
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;
            answ=answ^start+2*i;
        }
        
        return answ;
    }
};