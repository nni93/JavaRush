package com.javarush.test.level04.lesson13.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i, j, n = 10, m;
        for (i = 0; i < n; ++i) {
        m = n - i;
        for (j = 0; j < m; ++j)
        System.out.print('8');
        System.out.println(); 
    }
    }
}
