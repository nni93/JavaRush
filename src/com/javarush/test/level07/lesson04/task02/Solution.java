package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* ������ �� ������� � �������� �������
1. ������� ������ �� 10 �������.
2. ������ � ���������� 8 ������� � ��������� �� � ������.
3. ������� ���������� ����� ������� (10 ���������) �� ����� � �������� �������. ������ ������� - � ����� ������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] s = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            s[i] = reader.readLine();
        }
        Collections.reverse(Arrays.asList(s));
        for (int i = 0; i < s.length; i++)
        System.out.println(s[i]);
    }
}