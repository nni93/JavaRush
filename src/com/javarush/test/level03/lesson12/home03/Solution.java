package com.javarush.test.level03.lesson12.home03;

import java.util.Scanner;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
    	int n;
    	
    	Scanner in = new Scanner(System.in);
    	n = in.nextInt();
    	System.out.println("Я буду зарабатывать $" + n + " в час");
    }
}