package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* ћаксимальное и минимальное числа в массиве
—оздать массив на 20 чисел. «аполнить его числами с клавиатуры. Ќайти максимальное и минимальное числа в массиве.
¬ывести на экран максимальное и минимальное числа через пробел.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
             array[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(array);
        maximum = array[array.length - 1];
        minimum = array[0];
        System.out.println(maximum);
        System.out.println(minimum);
    }
}