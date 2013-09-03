package com.javarush.test.level13.lesson11.home06;

/* ����������� ������
1. ��������� ������������ � ������� � ����������� ���, ����� ��������� ��������������� � ���������� ������ �� �� �����.
2. ����� Hobbie ������ ������������� �� ����������� Desire, Dream.

@author Nikolaieva Natalia
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        System.out.println(Dream.HOBBIE.toString());
        System.out.println(new Hobbie().INDEX);
    }

    interface Desire
    {
    }

    interface Dream
    {
        static Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie implements Desire, Dream
    {
        static int INDEX = 1;

        @Override
        public String toString()
        {
            INDEX++;
            return "" + INDEX;
        }
    }

}