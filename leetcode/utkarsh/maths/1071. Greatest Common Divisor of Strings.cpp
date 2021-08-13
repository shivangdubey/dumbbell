class Solution {
public:
    string gcdOfStrings(string str1, string str2) {
        if(str1+str2 != str2+str1) //agr dono hi unequal h toh  
            return "";
        else if (str1==str2){ 
            return str1;
        } else if (str1.length() > str2.length()){ //if ABC ,   ABCABCABC
            return gcdOfStrings(str1.substr(str2.length()),str2); // str 1 ko itna kaato ki sstr2 jitna kat jaye
            // ABC | ABCABC           RETURN(3,ABCABCABC)
        } else { // else ABCABCABC, ABC
            return gcdOfStrings(str2.substr(str1.length()),str1); // str2 ko itna kato ki str 1 jitna kat jaye
        }
    }
};