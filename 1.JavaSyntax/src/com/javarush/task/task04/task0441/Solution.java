package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s[] = new String[3];
        int n[] = new int[3];

        for (int i = 0; i <= 2; i++){
            s[i] = reader.readLine();
            n[i] = Integer.parseInt(s[i]);

        }

        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length-i-1; j++) {
                if (n[j]< n[j+1]) {
                    int buf = n[j];
                    n[j] = n[j+1];
                    n[j+1] = buf;
                }
            }
        }

        System.out.println(n[1]);
    }
}
