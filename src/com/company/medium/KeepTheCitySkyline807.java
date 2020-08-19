package com.company.medium;

public class KeepTheCitySkyline807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] row=new int[grid[0].length];
        int[] col=new int[grid.length];
        int sum=0;
        for(int i=0;i<grid.length;i++){
            int maxCol=0;
            for(int j=0;j<grid[0].length;j++){
                sum+=grid[i][j];
                if(maxCol<grid[i][j]){
                    maxCol=grid[i][j];
                }
                if(col[j]<grid[i][j]){
                    col[j]=grid[i][j];
                }
            }
            row[i]=maxCol;
        }
        int sumadd=0;
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                sumadd+=Math.min(row[i],col[j]);
            }
        }
        sum=sumadd-sum;
        return sum;
    }
}
