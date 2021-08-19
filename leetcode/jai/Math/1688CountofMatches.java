package com.maths;
//Leetcode 1688
public class CountofMatches {
    public int numberOfMatches(int teams) {

        int matches;
        int advance;
        int ans = 0;

        while(teams != 1) {
            if(teams%2 == 0) {
                matches = teams / 2;
                advance = teams / 2;
                ans += matches;
                teams = advance;
            }
            else if(teams%2 == 1) {
                matches = teams / 2;
                advance = (teams / 2) + 1;
                ans += matches;
                teams = advance;
            }

        }

        return ans;

    }
}
