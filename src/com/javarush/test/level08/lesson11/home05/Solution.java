package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ���� ���� ����. ������ � ������� �����
�������� ���������, ������� ������ � ���������� ������ ������.
��������� �������� � ������ ������ ����� ���� ���� �� ���������.
������ �����:
����     ���� ����.
������ ������:
����     ���� ����.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        StringBuilder b = new StringBuilder(s);
        int i = 0;
        do {
            b.replace(i, i + 1, b.substring(i,i + 1).toUpperCase());
            i =  b.indexOf(" ", i) + 1;
        } while (i > 0 && i < b.length());
        
        System.out.println(b.toString());
    }
}