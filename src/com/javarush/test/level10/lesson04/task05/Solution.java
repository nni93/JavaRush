package com.javarush.test.level10.lesson04.task05;

/* ������ �5 �� �������������� ����� �����
�������� ��� ����� �������� ���������� ����:
short number = 9;
char zero = '0';
short nineCode = zero + number;

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        short number = 9;
        char zero = '0';
        short nineCode = (short) (zero + number);
    }
}