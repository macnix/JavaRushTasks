package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine())) {
            int[] count = new int[256];
            int maxByte = Integer.MIN_VALUE;

            while (fis.available() > 0) {
                int tmp = fis.read();
                if (maxByte < ++count[tmp]) {
                    maxByte = count[tmp];
                }
            }

            for (int i = count.length - 1; i >= 0; i--) {
                if (count[i] == maxByte) {
                    System.out.print(i + " ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
