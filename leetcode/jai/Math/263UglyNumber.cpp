//Problem Link: https://leetcode.com/problems/ugly-number/
class Solution {
public:
    bool isUgly(int n) {
        vector<int> v = {2, 3, 5};

        for (int i = 2; i < 6 && n; i++) {
            //divide 'n' by 'i' till 'i' is completely dividing 'n'
            while (n % i == 0) {
                n /= i;
            }
            //do the same thing for all values of i
        }

        if (n == 1) { //if the no. has been completely divided by 2, 3, 5
            return true;
        }
        else {//if the no. still has a factor other than 2, 3, 5
            return false;
        }
    }
};