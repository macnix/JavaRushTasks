package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sYear = reader.readLine();
        String sMonth = reader.readLine();
        String sDay = reader.readLine();
        int Year = Integer.parseInt(sYear);
        int Month = Integer.parseInt(sMonth);
        int Day = Integer.parseInt(sDay);

        System.out.println("Меня зовут "+ name+".");
        System.out.println("Я родился " + Day +"."+Month+"."+Year);
    }
}
