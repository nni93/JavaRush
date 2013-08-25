package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* ���� ���������� �����
������� ����� ��� � Cat, � ����� ����� (String).
������� ������� Map(<String, Cat>) � �������� ���� 10 ����� � ���� �����-����.
�������� �� Map ���������(Set) ���� ���� � ������� ��� �� �����.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map = new HashMap<String, Cat>();
        Cat[] cat = new Cat[10];
        for (int i = 0; i < cat.length; i++) {
        	cat[i] = new Cat("Some name" + i);
            map.put("Some name" + i, cat[i]);
        }
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<Cat>(map.values());
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }
}