package com.javarush.test.level10.lesson11.home03;

/* ѕравильный ответ: d=1.0
ƒобавить одну операцию по преобразованию типа, чтобы получалс€ ответ: d=1.0.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte) a + b/c/e;

        System.out.println(d);
    }
}