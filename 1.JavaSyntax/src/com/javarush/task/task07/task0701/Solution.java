package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] numbers = new int[20];
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = Integer.parseInt(bis.readLine());
        }
        return numbers;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array[0];
    }
}
