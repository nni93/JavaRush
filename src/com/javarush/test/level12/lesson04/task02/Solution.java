package com.javarush.test.level12.lesson04.task02;

/* print(int) � print(Integer)
�������� ��� ������: print(int) � print(Integer).
�������� ����� ��� � ������ main, ����� ��������� ��� ���.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        int i = 0;
        Integer integer = 0;
        print(i);
        print(integer);
    }

    public static int print(int i) {
        return i;
    }

    public static Integer print(Integer integer) {
        return integer;
    }
}