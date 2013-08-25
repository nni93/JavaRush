package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] array5 = new int[5];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = i;
        }
        int[] array2 = new int[2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i;
        }
        int[] array4 = new int[4];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = i;
        }
        int[] array7 = new int[7];
        for (int i = 0; i < array7.length; i++) {
            array7[i] = i;
        }
        int[] array0 = new int[0];
        for (int i = 0; i < array0.length; i++) {
            array0[i] = i;
        }
        list.add(array5);
        list.add(array2);
        list.add(array4);
        list.add(array7);
        list.add(array0);

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}