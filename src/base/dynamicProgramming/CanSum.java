package base.dynamicProgramming;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CanSum {
    public static void main(String[] args) {
        Map<Integer, Boolean> map=new HashMap<>();
        int[] numbers={2,3,5};
        int targetSum=8;
        System.out.println(canSum(targetSum, numbers, map));

    }
    public static boolean canSum(int targetSum, int[] numbers, Map<Integer,Boolean> map){
        if(map.containsKey(targetSum))
            return map.get(targetSum);
        if(targetSum==0)
            return true;
        if(targetSum<0)
            return false;
        int remainder;
        for(int num : numbers){
            remainder=targetSum-num;
            if(canSum(remainder,numbers,map))
            {
                map.put(targetSum,true);
                return true;
            }
        }

        map.put(targetSum,false);

        return false;
    }
}
