package com.javarush.test.level04.lesson13.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      String name;
      
      InputStreamReader ISR = new InputStreamReader(System.in);
      BufferedReader BR = new BufferedReader(ISR);
      
      name = BR.readLine();
      for (int i = 1; i <= 10; i++){
      System.out.println(name + " любит меня.");
      }
    }
}