package com.masanta.ratan.leetcode.easy.string.manipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("[{}]("));
		
	}
	
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> storageMap = new HashMap<>();
        storageMap.put(')','(');
        storageMap.put('}','{');
        storageMap.put(']','[');
        for(char ch : s.toCharArray()){
            if(storageMap.containsKey(ch)){
                if(!stack.isEmpty() && stack.peek() == storageMap.get(ch))
                    stack.pop();
                else
                    return false;
            }
            else {
                stack.push(ch);
            }
        }
        
        return stack.isEmpty();
        
    }
      

}
