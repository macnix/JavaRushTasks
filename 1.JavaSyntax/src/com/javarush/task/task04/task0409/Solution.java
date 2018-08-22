package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(7, 14);
    }

    public static void closeToTen(int a, int b) {
        //напишите тут ваш код  m-a n-b

        int num=10;
        if(a== b){
            System.out.println(a);
        }
         else if(abs(a- num) > abs(num - b)){

                System.out.println(b);
            } else {
                System.out.println(a);
            }


    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}