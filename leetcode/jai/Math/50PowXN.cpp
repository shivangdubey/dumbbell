//Problem Link: https://leetcode.com/problems/powx-n/
class Solution {
public:
    double myPow(double x, int n) {

        double ans = 1.0;
        long long pow = n;

        if (pow < 0) {
            pow *= -1;//convert pow to positive value
        }

        while (pow > 0) {
            if (pow % 2 == 0) { //if even power
                x = x * x;
                pow = pow / 2;
            }
            else if (pow % 2 == 1) { //if odd power
                ans = ans * x;
                pow = pow - 1;
            }
        }

        if (n < 0) {
            ans = (double)(1.0) / (double)(ans);
        }

        return ans;
    }
};