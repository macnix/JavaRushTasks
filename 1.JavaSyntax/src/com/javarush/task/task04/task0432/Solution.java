package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int n2 = Integer.parseInt(s2);

        while (n2>0) {
            System.out.println(s1);
            n2 = n2-1;
        }
    }
}
