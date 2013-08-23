package com.javarush.test.level08.lesson03.task02;

/* HashMap �� 10 ���
������� ��������� HashMap<String, String>, ������� ���� 10 ��� �����:
����� � �����, ����� � �����, ����� � �����, ����� � �����, ���� � ����, ������� � ����, ����-���� � ������, ��������� � �����, ���� � ������, ��������� � �������.
������� ���������� ��������� �� �����, ������ ������� � ����� ������.
������ ������ (��� �������� ������ ���� ������):
��������� � ����

@author Nikolaieva Natalia
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("�����", "�����");
        map.put("�����", "�����");
        map.put("�����", "�����");
        map.put("�����", "�����");
        map.put("����", "����");
        map.put("�������", "����");
        map.put("����-����", "������");
        map.put("���������", "�����");
        map.put("����", "������");
        map.put("���������", "�������");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}