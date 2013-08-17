package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int sum = 0;
        int i;
        String s;
        String keyWord = "сумма";

        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);

        while(!(keyWord).equals(s = BR.readLine())) {
            i = Integer.parseInt(s);
            sum += i;
        }
        System.out.println(sum);
    }
}
