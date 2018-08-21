package com.javarush.task.task03.task0324;

/* 
Меркантильные намерения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i = i + 1){
            System.out.println("Я хочу большую зарплату, и для этого изучаю Java");
        }

        int n = 10;
        String str = "Я хочу большую зарплату, и для этого изучаю Java";
        String repeated = new String(new char[n]).replace("\0", str+"\n");
        System.out.println(repeated);
    }
}
