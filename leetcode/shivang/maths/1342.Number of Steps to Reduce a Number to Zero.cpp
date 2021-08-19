class Solution {
public:
    int xorOperation(int n, int start) {
        int result;
        result = start;
        for (int i = 1; i < n; i++)
        {
            result = result ^ (start + 2 * i);
        }
        return result;
    }

};
//Took reference about Bitwise through Internet