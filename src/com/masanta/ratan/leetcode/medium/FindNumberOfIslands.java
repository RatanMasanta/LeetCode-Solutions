package com.masanta.ratan.leetcode.medium;

public class FindNumberOfIslands {

	public static void main(String[] args) {
		System.out.println(
				
				
				
				);

	}
	
	 public static int numIslands(char[][] grid) {
	        
	        int M = grid.length, N = grid[0].length;
	        int noOfIslands = 0;
	        for(int i=0; i<M; i++){
	            for(int j=0; j<N; j++){
	                if(grid[i][j]=='1'){
	                    helper(grid, i, j, M, N);
	                    noOfIslands++;
	                }
	            }
	        }
	        return noOfIslands;
	    }
	    public static void helper(char[][] grid, int sr, int sc, int row, int col){
	        //1) check is sr less than 0 or
	        //2) check is sr greater than or equal to row Length
	        //3) check if sc less than 0 
	        //4) check if sc greater than or equal to col Length
	        //5) check if current element if 0
	        //6) check if current element is visited (2);
	        if(sr<0 || sr>=row || sc<0 || sc>=col || grid[sr][sc]=='0' || grid[sr][sc]=='2') return;
	        //marking element as visited here I used  '2' you can use any value or character except 1
	        grid[sr][sc]='2';
	        //recursive call for bottom
	        helper(grid, sr+1, sc, row, col);
	        //recursive call for top
	        helper(grid, sr-1, sc, row, col);
	        //recursive call for right
	        helper(grid, sr, sc+1, row, col);
	        //recursive call for left
	        helper(grid, sr, sc-1, row, col);
	    }

}
