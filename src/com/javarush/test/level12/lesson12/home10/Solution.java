package com.javarush.test.level12.lesson12.home10;

/* �����, ������� ������� �� ����� ����� 10
������ ��� ���� �����, ����� ��������� �������� �� ����� ����� 10.
���������: ��������� ���������� �������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i)
    {
        return i*i;
    }

    public static int transformValue(Integer i) {
        return i*2;
    }
}