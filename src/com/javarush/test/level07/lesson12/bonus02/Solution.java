package com.javarush.test.level07.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* ����� �������� � ��������� ����� ����������������
������:  ��������� ������ ������, ���� ������������ �� ����� ������ ������ (����� enter). ����� ��� ������������ ������ � ������� ������� (���� ������������ � ����) � ������� �� �� �����.
����� ������: ��������� ������ ������, ���� ������������ �� ����� ������ ������ (����� enter). ����� ��������� ������ ����� ������. ���� � ������ ������ ����� ����, ������ �����������, ���� �������� � �����������.
������ �����:
���
����
�
������ ������:
��� ��� ���
���� ����
� � �

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        
        ArrayList<String> stringArrayList = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).length())%2 == 0) {
            	stringArrayList.add(list.get(i));
            	stringArrayList.add(list.get(i));
            }  else if ((list.get(i).length())%2 != 0) {
            	stringArrayList.add(list.get(i));
            	stringArrayList.add(list.get(i));
            	stringArrayList.add(list.get(i));
            }
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < stringArrayList.size(); i++)
        {
            String s = stringArrayList.get(i);
            listUpperCase.add(s.toUpperCase());
        }

        for (int i = 0; i < listUpperCase.size(); i++)
        {
            System.out.println(listUpperCase.get(i));
        }
    }
}