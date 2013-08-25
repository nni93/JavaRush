package com.javarush.test.level09.lesson02.task05;

/* ћетод должен возвращать результат Ц глубину еЄ стек-трейса
Ќаписать метод, который возвращает результат Ц глубину его стек трейса Ц количество методов в нем (количество элементов в списке). Ёто же число метод должен выводить на экран.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static int getStackTraceDeep()
    {
        int i = Thread.currentThread().getStackTrace().length;
        System.out.println(i);
        return i;
    }
}