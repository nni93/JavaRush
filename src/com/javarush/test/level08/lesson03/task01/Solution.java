package com.javarush.test.level08.lesson03.task01;

/* HashSet �� ��������
������� ��������� HashSet � ����� ��������� String.
�������� � �� 10 �����: �����, �����, �����, �����, ����, �������, ����-����, ���������, ����, ���������.
������� ���������� ��������� �� �����, ������ ������� � ����� ������.
����������, ��� ��������� ������� ����������� ���������.

@author Nikolaieva Natalia
*/

import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<String> set = new HashSet<String>();
        set.add("�����");
        set.add("�����");
        set.add("�����");
        set.add("�����");
        set.add("����");
        set.add("�������");
        set.add("����-����");
        set.add("���������");
        set.add("����");
        set.add("���������");

        for (String s : set) {
            System.out.println(s);
        }
    }
}