package com.javarush.test.level06.lesson11.bonus01;

/* ����� ��������� ���������, ����� ��������������� � ��������
������: ��������� ������ ��� ����� � ���������� � ������� �� �������� � ���� �Max is 25�

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static int max = 100;
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        String maximum = "Max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        max = a > b ? a : b;

        System.out.println(maximum + max);
    }

}