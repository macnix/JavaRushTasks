package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String letter = Integer.toString(number);
        int l1 = Character.getNumericValue(letter.charAt(0));
        int l2 = Character.getNumericValue(letter.charAt(1));
        int l3 = Character.getNumericValue(letter.charAt(2));
        return l1 + l2 + l3;
    }
}