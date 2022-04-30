package base.dynamicProgramming;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FibNthNumber {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<Integer, Integer>() ;
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy hh:mm:ss.MS");
        Date date1= new Date();
        System.out.println(sdf.format(date1));
        System.out.println(fib_dyn(50,map));
        Date date2= new Date();
        long ms=date2.getTime()-date1.getTime();
        long sec=ms/1000;
        System.out.println(sdf.format(date2));
        System.out.println(sec);
    }

    public static int  fib_recurr(int n){
        if(n<=2)
            return 1;
        else
            return (fib_recurr(n-1) + fib_recurr(n-2));
    }
    public static int  fib_dyn(int n, Map<Integer,Integer> map){
        if(map.containsKey(n))
            return map.get(n);
        else if(n<=2)
            return 1;
        else
        {
            map.put (n,fib_recurr(n-1) + fib_recurr(n-2));
            return map.get(n);
        }
    }
}
