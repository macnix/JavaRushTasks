package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Stallone1", new Date("JUNE 2 1980"));
        map.put("Stallone2", new Date("JUNE 3 1980"));
        map.put("Stallone3", new Date("JULY 3 1980"));
        map.put("Stallone4", new Date("JULY 8 1980"));
        map.put("Stallone5", new Date("APRIL 8 1980"));
        map.put("Stallone6", new Date("SEPTEMBER 8 1980"));
        map.put("Stallone7", new Date("AUGUST 8 1980"));
        map.put("Stallone8", new Date("MAY 9 1980"));
        map.put("Stallone9", new Date("DECEMBER 18 1980"));
        return map;

}

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Date>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Date> entry = iter.next();
            if (entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
