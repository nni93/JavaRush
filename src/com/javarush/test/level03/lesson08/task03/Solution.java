package com.javarush.test.level03.lesson08.task03;

/* Скромность украшает человека
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!
Пример: Тимур зарабатывает $5,000. Ха-ха-ха!

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.NumberFormat.*;
import java.util.Locale;

public class Solution
{
 public static void main(String[] args) throws Exception
    {
          String name;

          InputStreamReader ISR = new InputStreamReader(System.in);
          BufferedReader BR = new BufferedReader(ISR);
      try {     
          name = BR.readLine(); 
          System.out.print(name);
          
          System.out.print(" зарабатывает $5,000"); 

          System.out.print(". Ха-ха-ха!");
           
          BR.close();
          ISR.close();
          
      } catch (IOException e){
              System.out.println("ошибка ввода " + e);        
    }
 }
}
