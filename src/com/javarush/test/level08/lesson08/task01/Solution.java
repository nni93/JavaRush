package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;

/* 20 ���� �� ����� �˻
������� ��������� ����� (Set<String>), ������� � ���� 20 ���� �� ����� �˻.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            String s = Integer.toString(i);
            set.add("�" + i);
        }
        return set;
    }
}
