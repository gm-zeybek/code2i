package com.code2i;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /**

         “In a language of your choice, using all best practice principles you’re aware of,
         could you please provide code that
         1-iterates in multiples of A until X,
         2-then in multiples of A + 1 until 2X,
         3-then multiples of A + 2 until 3X.
         4-Please state any assumptions you’ve made.
         5-Please upload to a public Github repository and share the link.”
         */

        Map<Integer, Integer> result = multiplesOfAs(2, 20);
        System.out.println(result);

    }


    public static Map<Integer,Integer> multiplesOfAs(Integer a, Integer x){
        // 1.assumption a+2<3x
        if(a+2 >= 3*x){
            throw new RuntimeException("A+2 should be less than 3x please try");
        }else{
        }
        Map result = new HashMap<Integer,Integer>();

        result.put(a,iterateNumber(a,x));
        result.put(a+1,iterateNumber(a+1,2*x));
        result.put(a+2,iterateNumber(a+2,3*x));

        return result;
    }

    public static List iterateNumber(Integer startIndex, Integer endIndex) {
        List xList = new ArrayList<Integer>();
        // 2. assumption x is inclusive
        for (int i = startIndex; i <= endIndex; i++) {
            if (startIndex % i == 0) {
                xList.add(i);
            }
        }
        return xList;
    }




}
