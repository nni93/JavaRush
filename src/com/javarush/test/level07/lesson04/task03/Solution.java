package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 �������
1. ������� ������ �� 10 �����.
2. ������� ������ �� 10 �����.
3. ������ � ���������� 10 �����, ��������� ��� ������ �����.
4. � ������ ������ ������� ����� �������� ����� ������ �� ������� �����, ������/����� ������ ������� ��������� � ������� �������� �� ������� �����. ������� ���������� ������� ����� �� �����, ������ �������� �������� � ����� ������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] s = new String[10];
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < s.length; i++) {
           s[i] = reader.readLine();
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = s[i].length();
            System.out.println(array[i]);
        }
    }
}
