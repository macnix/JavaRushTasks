package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n % 2 == 0 &&  Integer.toString(n).length() == 1&& n>0 && n<=999) {
            System.out.println("четное однозначное число");
        }
        if(n % 2 != 0 && Integer.toString(n).length() == 1&& n>0 && n<=999){
            System.out.println("нечетное однозначное число");
        }
        if(n % 2 == 0 &&  Integer.toString(n).length() == 2&& n>0 && n<=999) {
            System.out.println("четное двузначное число");
        }
        if(n % 2 != 0 && Integer.toString(n).length() == 2&& n>0 && n<=999){
            System.out.println("нечетное двузначное число");
        }
        if(n % 2 == 0 &&  Integer.toString(n).length() == 3&& n>0 && n<=999) {
            System.out.println("четное трехзначное число");
        }
        if(n % 2 != 0 && Integer.toString(n).length() == 3&& n>0 && n<=999){
            System.out.println("нечетное трехзначное число");
        }
    }
}
