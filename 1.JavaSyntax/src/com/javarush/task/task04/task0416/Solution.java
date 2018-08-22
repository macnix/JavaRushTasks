package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String TimeS=reader.readLine();
        Double TimeD=Double.parseDouble(TimeS);
        if(TimeD % 10 >=0&&TimeD % 10 <3||TimeD % 10 >=5&&TimeD % 10 <8)
            System.out.println("зеленый");
        if(TimeD % 10 >=3&&TimeD % 10 <4||TimeD % 10 >=8&&TimeD% 10 <9)
            System.out.println("желтый");
        if(TimeD % 10 >=4&&TimeD % 10 <5||TimeD % 10 >=9&&TimeD % 10 <10)
            System.out.println("красный");
    }
}