package com.javarush.test.level05.lesson12.bonus01;

import java.io.*;

/* ����� ��������� ���������, ����� ��������������� � ��������
������: ��������� ������ ��� ����� � ���������� � ������� �� ����� �� �����.

@author Nikolaieva Natalia
*/

public class Solution
{
   public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
