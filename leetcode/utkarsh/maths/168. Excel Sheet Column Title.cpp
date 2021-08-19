class Solution {
public:
    string convertToTitle(int columnNumber) {
        string answ= "";
        while(columnNumber) {
            columnNumber-=1;
            char c=(char) (columnNumber%26) + 'A';
                answ=c+answ;
                columnNumber=columnNumber/26;
        }
        
        return answ;
    }
};