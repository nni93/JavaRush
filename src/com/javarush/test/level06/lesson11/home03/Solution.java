package com.javarush.test.level06.lesson11.home03;

/* ��������� ���� ����������� static
��������� ���� ����������� static, ����� ������ ���������������.

@author Nikolaieva Natalia
*/

public class Solution
{

    static public int A = 5;
    public int B = 2;
    public int C = A*B;

    public static void main(String[] args)
    {
        A = 15;
    }

}