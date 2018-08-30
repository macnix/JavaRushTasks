package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine())) {
            Map<Integer, Integer> map = new HashMap<>();
            int min = Integer.MAX_VALUE;
            while (fis.available() > 0) {
                int newValue = map.merge(fis.read(), 1, (o, n) -> o + n);
                if (newValue < min) {
                    min = newValue;
                }
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == min) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

}
