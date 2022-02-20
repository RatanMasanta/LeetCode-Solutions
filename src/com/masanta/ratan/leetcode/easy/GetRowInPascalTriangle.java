package com.masanta.ratan.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class GetRowInPascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> row = getRow(5);
		for(int i: row)
			System.out.print(i + " ");
	}

	public static List<Integer> getRow(int rowIndex) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            ArrayList<Integer> al2 = new ArrayList<>();
            al2.add(1);
            for (int j = 0; j < al.size() - 1; j++)
                al2.add(al.get(j) + al.get(j + 1));
            al2.add(1);
            al = al2;
        }
        return al;
    }
}
