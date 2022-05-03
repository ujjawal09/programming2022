package base.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class GridTraveler {
    public static void main(String[] args) {
    Map<String,Long>  map= new HashMap<>();
    System.out.println(gridTraveler(18,18,map));
    }

    public static long gridTraveler(int rows, int cols, Map<String, Long> map){
        String str=rows+","+cols;
        if(map.containsKey(str))
            return map.get(str);
        str=cols+","+rows;  //gridTraveler(a,b)= gridTraveler(b,a)
        if(map.containsKey(str))
            return map.get(str);
      if(rows==1 && cols==1)
          return 1;
      else if(rows==0 || cols==0)
          return 0;
      map.put(rows+","+cols,gridTraveler(rows-1,cols,map)+gridTraveler(rows,cols-1,map));
      return map.get(rows+","+cols);

    }


}
