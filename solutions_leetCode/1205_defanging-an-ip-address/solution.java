import java.util.*;
// https://leetcode.com/problems/defanging-an-ip-address

class Solution {
    public String defangIPaddr(String address) {
     String newAdd=address.replaceAll("\\.", "[.]");
    return newAdd;       
    }
}