package com.javarush.test.level07.lesson06.task05;

/* ����� ��������� ������ � ������ � � ������
1. ������ ������ �����.
2. ������ � ���� 5 ������� � ����������.
3. ����� ��������� ������ � ������ � � ������. ��������� 13 ���.
4. ��������� ���� ������ ���������� �� �����, ������ �������� � ����� ������.

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int listSIze = 5;
        int iteration = 13;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listSIze; i++) {
            list.add(reader.readLine());
        }
        for (int j = 0; j < iteration; j++) {
            list.add(0, list.remove(list.size() - 1));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}