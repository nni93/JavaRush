package com.javarush.test.level12.lesson02.task02;

/* ������ �� ��������� �� �����
�������������� ����� getName � ������ Whale(���), ����� ��������� ������ �� �������� �� �����.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow
    {
        public String getName()
        {
            return "� - ������";
        }
    }

    public static class Whale extends Cow
    {
       public String getName() {
           return "";
       }
    }
}