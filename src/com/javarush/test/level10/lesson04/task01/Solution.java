package com.javarush.test.level10.lesson04.task01;

/* ������ �1 �� �������������� ����� �����
�������� ��� ����� �������� ���������� ����:
byte a = 1234;
int b = a;
byte c = a * a;
int d = a / c;

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        byte a = (byte) 1234;
        int b = a;
        byte c = (byte) (a * a);
        int d = a / c;
    }
}