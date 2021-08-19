class Solution {
public:
    bool no_zero(int x){
        while(x){
            if(x%10==0)
                 return false;
                 
                
             x=x/10;
         }
        return true;            
        
    }
    vector<int> getNoZeroIntegers(int n) {
        vector<int> answ;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n){
                    if(no_zero(i) && no_zero(j)){
                    answ.push_back(i);
                    answ.push_back(j);
                        return answ;
                    } 
                    
                }
            }
        }
        return answ;
    }
};