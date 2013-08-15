package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
          Integer a, b, c;
          InputStreamReader ISR = new InputStreamReader(System.in);
          BufferedReader BR = new BufferedReader(ISR);
          try {
          a = Integer.valueOf(BR.readLine());
          b = Integer.valueOf(BR.readLine());
          c = Integer.valueOf(BR.readLine());
          if ((a > b) & (a > c) & (b > c)) {
          System.out.print(a + " " + b + " " + c);
          } else if ((b > a) & (b > c) & (a > c)) {
          System.out.print(b + " " + a + " " + c);
          } else if ((c > a) & (c > b) & (a > b)) {
          System.out.print(c + " " + a + " " + b);
          } else if ((a > b) & (a > c) & (c > b)) {
          System.out.print(a + " " + c + " " + b);
         } else if ((b > a) & (b > c) & (c > a)) {
          System.out.print(b + " " + c + " " + a);
         } else if ((c > a) & (c > b) & (b > a)) {
          System.out.print(c + " " + b + " " + a);
          }
         } catch (IOException e){
              System.out.println("ошибка ввода " + e);        
    }
    }
}
