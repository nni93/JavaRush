package com.javarush.test.level10.lesson11.home01;

/* ѕравильный ответ: d=2.941
ƒобавить одну операцию по преобразованию типа, чтобы получалс€ ответ: d=2.941.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 50;
        int b = 17;
        double d = (double) a / b;
        System.out.println(d);
    }
}