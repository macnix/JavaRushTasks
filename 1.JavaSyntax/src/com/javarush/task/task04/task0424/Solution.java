package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

       if(a==b || a==c ||b==c) {
        if(a!=b && b==c) System.out.println("1");
        if(a==c && b!=c) System.out.println("2");
        if(a==b && b!=c) System.out.println("3");
       }


    }
}
