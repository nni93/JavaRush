package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;

/* ����� �������
1. ������ ������ �� ���� �����, �����, �����.
2. ����� ������� ����� ������ � ������ ������, ���������� ����� �������.
3. ��������� ���� for ������� ��������� �� �����, ������ ������� ������ � ����� ������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("����");
        list.add("������");
        list.add("����");
        list.add("������");
        list.add("����");
        list.add("������");
        for (String s : list) {
            System.out.println(s);
        }
    }
}