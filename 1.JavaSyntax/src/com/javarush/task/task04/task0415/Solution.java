package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if ((a+b)>c && (a+c)>b && (b+c)>a)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}