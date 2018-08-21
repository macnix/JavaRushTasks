package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String[] top = {"Мама", "Мыла", "Раму"};

        for (int i = 0; i < top.length; i++){
            for(int j = 0; j < top.length; j++){
                for (int k = 0; k < top.length; k++){
                    if (i == j)
                        continue;
                    if (j == k)
                        continue;
                    if (k == i)
                        continue;

                    System.out.print(top[i]);
                    System.out.print(top[j]);
                    System.out.println(top[k]);
                }
            }
        }
    }
}
