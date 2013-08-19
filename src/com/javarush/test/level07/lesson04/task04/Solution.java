package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* ������ �� ����� � �������� �������
1. ������� ������ �� 10 �����.
2. ������ � ���������� 10 ����� � �������� �� � ������.
3. ����������� �������� ������� � �������� �������.
4. ������� ��������� �� �����, ������ �������� �������� � ����� ������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = new int[10];
        String[] s = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            s[i] = String.valueOf(array[i]);
        }
        Collections.reverse(Arrays.asList(s));
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
