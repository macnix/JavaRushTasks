package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int buffer;
        if (a < b) {
            buffer = b; b = a; a = buffer; // Если первое число меньше второго - меняем местами
        }
        if (b < c) {
            buffer = c; c = b; b = buffer; // Так же меняем второе и третье
        }
        if (a < b) {
            buffer = b; b = a; a = buffer; // И снова проверяем первое и второе (если второе и третье меняли)
        }
        System.out.println(a + " " + b + " " + c);

    }
}
