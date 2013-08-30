package com.javarush.test.level10.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* ������ �� ����������
������: ������ � ���������� 30 �����. ������� 10-� � 11-� ����������� �����.
���������:
����� ����������� ����� � 1-� �����������.
��������� ����������� ����� ���� � 2-� �����������
������:
1 6 5  7  1  15   63   88
������ ����������� � 1
������ ����������� � 1
������ ����������� � 5
��������� ����������� � 6

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array)
    {
        Arrays.sort(array);
    }
}