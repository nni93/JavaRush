package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры Имя и два числа, вывести надпись:
name1 получает «число1» денег через «число2» лет.
Пример: Коля получает 3000 через 5 лет.

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
          String name;
          Integer money;
          Integer time;
          InputStreamReader ISR = new InputStreamReader(System.in);
          BufferedReader BR = new BufferedReader(ISR);
      try {     
          name = BR.readLine(); 
          System.out.print(name);
          
          System.out.print(" получает ");
          money = Integer.valueOf(BR.readLine());
          System.out.print(money);
          
          System.out.print(" через ");
          time = Integer.valueOf(BR.readLine());
          System.out.print(time);
          
          System.out.print(" лет.");
          
          BR.close();
          ISR.close();
          
      } catch (IOException e){
              System.out.println("ошибка ввода " + e);        
    }
 }
}
