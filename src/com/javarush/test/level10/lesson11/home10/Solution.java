 package com.javarush.test.level10.lesson11.home10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* ���� ���������� �����
������� ������ ����� �����. ������ � ���������� 20 ����� �����. ������� ����� �� ����������� ���������� ����� �� ������:
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
����� ������ ���������� ������� ������ (list) �� ��� ������� (index). ���� � �������� ��������� �������� �������� ����������, ��� ����� �����������, � ����� ������ ������� defaultValue.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
        {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
    {
        try
        {
            return list.get(index);
            
        } catch (IndexOutOfBoundsException e) {
        	return defaultValue;
        }

    }
}