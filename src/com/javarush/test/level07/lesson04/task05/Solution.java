package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* ���� ������� ������ � ��� ���������
1. ������� ������ �� 20 �����.
2. ������ � ���� �������� � ����������.
3. ������� ��� ������� �� 10 ����� ������.
4. ����������� ������� ������ � ��� ���������: �������� ����� � ������ ���������, ������ �������� �� ������ ���������.
5. ������� ������ ��������� ������ �� �����, ������ �������� �������� � ����� ������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] arrayBig = new int[20];
        int[] arraySmallOne = new int[10];
        int[] arraySmallTwo = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arrayBig.length; i++) {
            arrayBig[i] = Integer.parseInt(reader.readLine());
        }
        arraySmallOne = Arrays.copyOfRange(arrayBig, 1, 10);
        arraySmallTwo = Arrays.copyOfRange(arrayBig, 10, 20);
        for (int i = 0; i < arraySmallTwo.length; i++) {
            System.out.println(arraySmallTwo[i]);
        }
    }
}
