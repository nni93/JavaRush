package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    String zahvat = "захватит мир через";
    String muhaha = "лет. Му-ха-ха!";
    Integer time;
          InputStreamReader ISR = new InputStreamReader(System.in);
          BufferedReader BR = new BufferedReader(ISR);
      try {     
          time = Integer.valueOf(BR.readLine());

          
          String userInput = BR.readLine(); 
          System.out.print(userInput);
          
          System.out.print(" " + zahvat +" ");
          
          System.out.print(time);
          System.out.print(" " + muhaha);
          
          BR.close();
          ISR.close();
          } catch (IOException e){
            System.out.println("ошибка ввода " + e);    
         }    
     }
}
