package com.javarush.task.task03.task0306;

/* 
Головоломка со скобками
*/

public class Solution {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int s=0;
        for (int i=0;i<9;i++){
            s=a*b;
            a=s;
            b++;
        }
        System.out.println (s);
        System.out.println("s = " + s);
    }
}
