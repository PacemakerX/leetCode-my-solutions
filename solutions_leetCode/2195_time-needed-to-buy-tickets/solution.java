import java.util.*;
// https://leetcode.com/problems/time-needed-to-buy-tickets

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int i=0;
        int count=0;
    while(tickets[k]>0){
        i=i%tickets.length;

        if(tickets[i]>0){
            tickets[i]--;
                count++;
        }
            i++;  
    }        
    return count;
    }
}