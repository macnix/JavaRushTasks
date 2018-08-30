package com.javarush.task.task09.task0922;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH);
        System.out.println(simpleDateFormat.format(date).toUpperCase());

    }
}