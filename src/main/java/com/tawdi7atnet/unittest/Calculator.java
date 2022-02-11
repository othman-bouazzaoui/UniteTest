package com.tawdi7atnet.unittest;

import java.util.function.BiFunction;

public class Calculator {

    public static BiFunction<Integer,Integer, Integer> somme = Integer::sum;

    public static BiFunction<Integer,Integer, Integer> multiply = (x,y) -> x*y;

    public static void methodTakeTime(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello I'm here ... ");
    }

}
