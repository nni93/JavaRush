package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        int i = 0;
        Integer integer = 0;
        print(i);
        print(integer);
    }

    public static int print(int i) {
        return i;
    }

    public static Integer print(Integer integer) {
        return integer;
    }
}
