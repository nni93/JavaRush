package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       String name1, name2, name3;

          InputStreamReader ISR = new InputStreamReader(System.in);
          BufferedReader BR = new BufferedReader(ISR);
          try {     
          name1 = BR.readLine(); 
          name2 = BR.readLine();
          name3 = BR.readLine();
          System.out.print(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
          BR.close();
          ISR.close();
          } catch (IOException e){
              System.out.println("ошибка ввода " + e);        
    }
    }
}
