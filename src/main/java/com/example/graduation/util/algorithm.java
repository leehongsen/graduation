package com.example.graduation.util;

public class algorithm {
    public int firstUniqChar(String s) {
        int retInt = -1;
        if(null == s || "".equals(s)){
            return retInt;
        }else if(s.length() == 1){
            return 0;
        }

        for(int i = 0;i < s.length() - 1;i++){
            boolean flag = false;
            for(int j = i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    flag = false;
                    break;
                }else{
                    flag = true;
                }
            }
            if (flag){
                return i;
            }
        }
        return retInt;
    }

    public static void main(String args[]){
        String s = "leetcode";
        System.out.println();
    }
}
