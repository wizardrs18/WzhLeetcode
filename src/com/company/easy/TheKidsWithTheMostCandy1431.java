package com.company.easy;

import java.util.ArrayList;
import java.util.List;
/**
 * @name: 1431. 拥有最多糖果的孩子
 * @author: wzh
 */
public class TheKidsWithTheMostCandy1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> candieskids = new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++){
            max= Math.max(max, candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)<max){
                candieskids.add(false);
            }else{
                candieskids.add(true);
            }
        }
        return candieskids;
    }
}
