package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.

@author Nikolaieva Natalia
*/

public class Solution
{
    static ArrayList<Object> arrayList = new ArrayList<Object>();
    static LinkedList<Object> linkedList = new LinkedList<Object>();

    public static List  getListForGet()
    {
        return arrayList;
    }

    public static List  getListForSet()
    {
        return arrayList;
    }

    public static List  getListForAddOrInsert()
    {
        return  linkedList;
    }

    public static List  getListForRemove()
    {
        return  linkedList;
    }
}