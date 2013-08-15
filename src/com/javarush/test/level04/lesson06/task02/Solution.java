package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
          Integer a, b, c, d;
          InputStreamReader ISR = new InputStreamReader(System.in);
          BufferedReader BR = new BufferedReader(ISR);
          try {
          a = Integer.valueOf(BR.readLine());
          b = Integer.valueOf(BR.readLine());
          c = Integer.valueOf(BR.readLine());
          d = Integer.valueOf(BR.readLine());
          if ((a > b) & (a > c) & (a > d)) {
          System.out.println(a);
          } else if ((b > a) & (b > c) & (b > d)) {
          System.out.println(b);
          } else if ((c > a) & (c > b) & (c > d)) {
          System.out.println(c);
          } else
          System.out.println(d);
          } catch (IOException e){
              System.out.println("ошибка ввода " + e);        
    }
    }
}
