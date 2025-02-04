package com.problemstatements.stringmanipulation.stringbuilder.removeduplicatesfromastring;

import java.util.HashSet;

public class RemoveDuplicatesFromString {
    public static String removeDuplicate(String str){
        HashSet<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!set.contains(ch)){
                sb.append(ch);
                set.add(ch);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str="hellohow";
        System.out.println(removeDuplicate(str));
    }
}
