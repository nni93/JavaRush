package com.javarush.test.level07.lesson06.task02;

/* 5 �������: �101�, �102�, �103�, �104�, �105�
1. ������ ������ �����.
2. ������ � ���� 5 �������: �101�, �102�, �103�, �104�, �105�.
3. ����� ������, ������� � ���������.
4. ��������� ���� ������ �� ����� ��� ����������, ������ �������� � ����� ������.
5. ������ ��� ������. (����� �������� ������ �������� ������� ��������� ��������.
��������, ���� ������� 0-� �������, �� ���, ������� ��� 1-�, ������ 0-�. � �.�.)

@author Nikolaieva Natalia
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("101");
        list.add("102");
        list.add("103");
        list.add("104");
        list.add("105");
        list.remove(0);
        list.remove(1);
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
    }
}