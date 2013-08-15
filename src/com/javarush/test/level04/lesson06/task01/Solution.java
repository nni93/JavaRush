package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
          Integer a, b;
          InputStreamReader ISR = new InputStreamReader(System.in);
          BufferedReader BR = new BufferedReader(ISR);
          try {
          a = Integer.valueOf(BR.readLine());
          b = Integer.valueOf(BR.readLine());
          if (a < b)
          System.out.println(a);
          else 
          System.out.println(b);
          } catch (IOException e){
              System.out.println("ошибка ввода " + e);   
    }
    }
}
