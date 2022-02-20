package com.masanta.ratan.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetWithDuplicatesFromIntegerArray {

	public static void main(String[] args) {
		
		int[] intArray = new int[] {1,2,3,4};
		List<List<Integer>> resultantSetList = subsetsWithDup(intArray);
		for(List<Integer> array : resultantSetList) {
			for(int item: array) {
				System.out.print(item + " ");
			}
			System.out.println("\r\n");
		}
	}
	
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : nums){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                Collections.sort(inner);
                if(! outer.contains(inner))
                    outer.add(inner);
            }
        }
        return outer;
    }

}
