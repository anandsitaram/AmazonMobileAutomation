package com.amazon.demo.utils;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author Anand B S
 * @date 05 Jul 2021
 */
public class TestUtil {


    public static int generateRandomNumber(int limit,int... excludes){
        Random random= new Random();
        int temp=random.nextInt(limit);
       for(int i:excludes){
           if(i==temp){
               temp=random.nextInt(limit);
           }
       }
       return  temp;
    }

}
