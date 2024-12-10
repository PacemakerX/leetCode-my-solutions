import java.util.*;
// https://leetcode.com/problems/valid-parentheses

class solution {
    public boolean isValid(String s) {
          if(s.length()%2==1)
        return false;
        StringBuilder str = new StringBuilder(s);
        int i=0;
        while(i<str.length()-1){
            if((str.substring(i, i+2).equals("()") || str.substring(i, i+2).equals("{}") || str.substring(i, i+2).equals("[]"))){

                str.delete(i, i+2);
                if(str.length()==0)
                return true;
                if(i!=0)
                i--;
            }
            else i++;
        }
        return false;
    }
}