package com.javarush.test.level04.lesson16.home02;

import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
       Integer first, second, third;
       
       Scanner in = new Scanner(System.in);
       
       first = in.nextInt();
       second = in.nextInt();
       third = in.nextInt();
       
       if ((second > first) & (first > third)) {
    	   System.out.println(first);
       } else if ((third > first) & (first > second)) {
    	   System.out.println(first);
       } else if ((first > second) & (second > third)) {
    	   System.out.println(second);
       } else if ((third > second) & (second > first)) {
    	   System.out.println(second);
       } else if ((first > third) & (third > second)) {
    	   System.out.println(third);
       } else if ((second > third) & (third > first)) {
    	   System.out.println(third);
       }
    }
}
