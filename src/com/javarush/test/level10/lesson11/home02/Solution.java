package com.javarush.test.level10.lesson11.home02;

/* ѕравильный ответ: d=5.5
ƒобавить одну операцию по преобразованию типа, чтобы получалс€ ответ: d=5.5.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b/c/(double) e;
        System.out.println(d);
    }
}