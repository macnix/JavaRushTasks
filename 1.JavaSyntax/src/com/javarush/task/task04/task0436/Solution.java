package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String String1 = reader.readLine();
        int m = Integer.parseInt(String1);
        String String2 = reader.readLine();
        int n = Integer.parseInt(String2);

        for(int i = 1; i<=m; i++) {
            for(int j = 1; j<=n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
