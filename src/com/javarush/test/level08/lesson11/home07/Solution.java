package com.javarush.test.level08.lesson11.home07;

/* ��������� ���� ����������� static
��������� ���� ����������� static, ����� ������ ���������������.

@author Nikolaieva Natalia
*/

public class Solution
{
    static public int A = 5;
    public static int B = 2;

    public int C = A*B;
    public static int D = B*A;

    public static void main(String[] args)
    {
    }

    public  int getValue()
    {
        return D;
    }

    public int getValue2()
    {
        return C;
    }
}