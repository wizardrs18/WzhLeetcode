package com.company.hard;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class DifferentPaths980 {
    public int uniquePathsIII(int[][] grid) {
//        List<Pair<Integer,Integer>> list=new ArrayList<>();
//        List<List<Pair<Integer,Integer>>> map=new ArrayList<>(list.size()+2);
//        Pair<Integer,Integer> start;
//        Pair<Integer,Integer> end;
//        for(int i=0;i<grid.length;i++){
//            for (int j=0;j< grid[0].length;j++){
//                if(grid[i][j]==0){
//                    list.add(new Pair<>(i,j));
//                }else if(grid[i][j]==1){
//                    start=new Pair<>(i,j);
//                    map.set(0, new ArrayList<Pair<Integer, Integer>>(){{add(start);}});
//                }else if(grid[i][j]==2){
//                    end=new Pair<>(i,j);
//                    map.set(map.size()-1, new ArrayList<Pair<Integer, Integer>>(){{add(end);}});
//                }
//            }
//        }
//        for(int i=0;i<map.size()/2;i++){
//
//        }
        int startx=0;
        int starty=0;
        int length=1;
        for(int i=0;i<grid.length;i++){
            for (int j=0;j< grid[0].length;j++){
                if(grid[i][j]==1){
                    startx=i;
                    starty=j;
                }else if(grid[i][j]==0){
                    length++;
                }
            }
        }
        return dfs(startx,starty,length,grid);
    }

    private int dfs(int startx, int starty, int length, int[][] grid) {
        if(startx<0||startx>=grid.length||starty<0||starty>=grid[0].length||grid[startx][starty]==-1){
            return 0;
        }else if(grid[startx][starty]==2){
            return  length==0 ? 1:  0;
        }
            grid[startx][starty]=-1;
            int sum=0;
            sum+=dfs(startx-1,starty,length-1,grid);
            sum+=dfs(startx+1,starty,length-1,grid);
            sum+=dfs(startx,starty-1,length-1,grid);
            sum+=dfs(startx,starty+1,length-1,grid);
            grid[startx][starty]=0;
            return sum;
    }
}
