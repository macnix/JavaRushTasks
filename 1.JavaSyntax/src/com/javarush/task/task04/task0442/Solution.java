package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = true;
        int sum = 0;

        while (exit) {
            String s = reader.readLine();
            int n = Integer.parseInt(s);
            sum = sum +n;
            if (n == -1) {
                exit = false;
            }
        }

        System.out.println(sum);
    }
}
