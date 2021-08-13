class Solution {
public:
    string convertToTitle(int columnNumber) {
        string ans;
        while (columnNumber) {
            // cout << n%26 << " ";
            ans.insert(ans.begin(), 'A' + (columnNumber - 1) % 26);
            columnNumber = (columnNumber - 1) / 26;
        }
        // cout << endl;

        return ans;

    }
};