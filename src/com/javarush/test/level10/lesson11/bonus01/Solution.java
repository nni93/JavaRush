package com.javarush.test.level10.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* ����� ��������� ���������, ����� ��������������� � ��������
������: ��������� ������������� ������ HashMap: ������ � ���������� ����� ��� (����� � ������), �������� �� � HashMap � ������� �� ����� ���������� HashMap.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        for (int i = 0; i < 10; i++)
        {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : map.entrySet())
        {
            int id = pair.getKey();
            String name = pair.getValue();
            System.out.println("Id=" + id + " Name=" + name);
        }
    }
}