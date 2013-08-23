package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.

@author Nikolaieva Natalia
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            map.put("Some Last Name" + i, "Some First Name");
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int countTheSameFirstName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue() == name) {
                countTheSameFirstName++;
            }
        }
        return countTheSameFirstName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int countTheSameLastName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey() == familiya) {
                countTheSameLastName++;
            }
        }
        return countTheSameLastName;
    }
}