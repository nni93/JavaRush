package com.javarush.test.level04.lesson06.task04;

/* —равнить имена
¬вести с клавиатуры два имени, и если имена одинаковые вывести сообщение Ђ»мена идентичныї. ≈сли имена разные, но их длины равны Ц вывести сообщение Ц Ђƒлины имен равныї.

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String name1, name2;
        
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        
        name1 = BR.readLine();
        name2 = BR.readLine();
        if (name1.equals(name2)) {
        System.out.println("»мена идентичны");
        } else if(name1.length() == name2.length()) {
        System.out.println("ƒлины имен равны");
          }
    }
}