package com.java.week06_07_2023;

import java.util.Arrays;

public class Anagram {
    public boolean FindAnagram(String name1,String name2){
        int c1[]=new int[256];
        int c2[]=new int[256];
        if(name1.length()!=name2.length())
            return false;

        for(int i=0;i<name1.length();i++){
            c1[name1.charAt(i)]++;
            c2[name2.charAt(i)]++;
        }
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i])
                return false;

        }
        return true;
    }
}