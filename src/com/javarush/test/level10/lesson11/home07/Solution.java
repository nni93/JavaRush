package com.javarush.test.level10.lesson11.home07;

/* ��������� ���� ����������� static
���������� ��� ����� ������ ������������� static ���, ����� ������ ���������������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Solution.D = 5 * D * C;

        Solution.D = 5;
    }

    public int getA()
    {
        return A;
    }

}