package com.javarush.test.level13.lesson02.task02;

/* ����: �����������
������ � ������ Beer ��������� Drink � �������� ��� ��������������� ������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Drink beer = new Beer();
        System.out.println(beer.toString());
    }

    public interface Drink
    {
        boolean isAlcoholic();
    }

    public static class Beer implements Drink
    {
        @Override
        public String toString()
        {
            if (isAlcoholic()) {
                return "������� �����������";
            }
            else {
                return "������� ��������������";
            }

        }

        @Override
        public boolean isAlcoholic()
        {
            return true;
        }
    }
}