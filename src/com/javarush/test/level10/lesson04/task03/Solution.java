package com.javarush.test.level10.lesson04.task03;

/* ������ �3 �� �������������� ����� �����
�������� ��� ����� �������� ���������� ����:
float f = 333.50;
int i = f;
byte b = i;

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        float f = (float) 333.50;
        int i = (int) f;
        byte b = (byte) i;
    }
}