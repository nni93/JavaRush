package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* ������������ � ����������� ����� � �������
������� ������ �� 20 �����. ��������� ��� ������� � ����������. ����� ������������ � ����������� ����� � �������.
������� �� ����� ������������ � ����������� ����� ����� ������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
             array[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(array);
        maximum = array[array.length - 1];
        minimum = array[0];
        System.out.println(maximum);
        System.out.println(minimum);
    }
}