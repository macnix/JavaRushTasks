package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b||b == c||c == a) {

            if (a == b&&b == c&&c == a) System.out.print(a + " " + b + " " + c);
            else {
                if (a == b) System.out.print(a +" " + b);
                if (a == c) System.out.print(a +" " + c);
                if (c == b) System.out.print(c +" " + b);
            }
        }
    }
}