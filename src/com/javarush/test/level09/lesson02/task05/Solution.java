package com.javarush.test.level09.lesson02.task05;

/* ����� ������ ���������� ��������� � ������� � ����-������
�������� �����, ������� ���������� ��������� � ������� ��� ���� ������ � ���������� ������� � ��� (���������� ��������� � ������). ��� �� ����� ����� ������ �������� �� �����.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static int getStackTraceDeep()
    {
        int i = Thread.currentThread().getStackTrace().length;
        System.out.println(i);
        return i;
    }
}