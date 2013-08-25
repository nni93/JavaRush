package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ������� � ��������� �����
�������� ���������, ������� ������ � ���������� ������ ������.
��������� ������ ������� �� ����� ��� ������:
1. ������ ������ �������� ������ ������� �����
2. ������ - ������ ��������� ����� � ����� ���������� �� �������� ������.
����� ��������� ��������.

������ �����:
���� ���� ����.
������ ������:
� � � � � �
� � � � � � .

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] c = string.toCharArray();
        for (int i = 0; i < c.length; i++) {
        if (isVowel(c[i])) {
            System.out.print(c[i] + " ");
         }
        }
        System.out.println();
        for (int j = 0; j < c.length; j++) {
        if (!isVowel(c[j])) {
        	if (c[j] == ' ') continue;
            System.out.print(c[j] + " ");
         }
        }
    }


    public static char[] vowels = new char[]{'�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};

    //����� ���������, ������� �� �����
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //�������� ������ � ������ ������� - �� ��������� � �������� ������

        for (char d : vowels)   //���� ����� ������� �������
        {
            if (c == d)
                return true;
        }
        return false;
    }
}