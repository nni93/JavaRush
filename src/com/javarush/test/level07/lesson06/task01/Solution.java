package com.javarush.test.level07.lesson06.task01;

/* 5 ��������� ������� � ������
1. ������ ������ �����.
2. ������ � ���� 5 ��������� �������.
3. ������ ��� ������ �� �����.
4. ��������� ���� ������ ��� ���������� �� �����, ������ �������� � ����� ������.

@author Nikolaieva Natalia
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Some string 1");
        list.add("Some string 2");
        list.add("Some string 3");
        list.add("Some string 4");
        list.add("Some string 5");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
