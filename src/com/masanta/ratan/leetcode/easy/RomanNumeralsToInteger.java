package com.masanta.ratan.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomanNumeralsToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));

	}
	
	public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        Stack<Character> stack = new Stack<>();
        
        char[] charArray = s.toCharArray();
        
        for(int i = 0; i < charArray.length; i++){
            stack.push(charArray[i]);
        }
        
        if(charArray.length == 0){
            return 0;
        }
        
        char previousPoppedChar = charArray[charArray.length - 1];
        
        int val = 0;
        
        while(!stack.isEmpty()){
            char current = stack.pop();
            
            if(map.get(current) < map.get(previousPoppedChar)){
                val = val - map.get(current);
            }else{
                 val = val + map.get(current);
            }
            
            previousPoppedChar = current;
        }
        
        return val;
        
    }

}
