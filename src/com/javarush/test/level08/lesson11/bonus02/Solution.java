package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* ����� �������� � ��������� ����� ����������������
������: ��������� ����������, ����� ����� (�������) ���� � ���� � ��������� �������.
����� ������: ��������� ������ �������� �� � �������� �����, � � ��������:
������ �����:
������
�������
����
�������
������
����������

������

������ ������:
����������


@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        while (true)
        {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }
        

        //read home number
        String read = reader.readLine();
        for (int i = 0; i < addresses.size(); i++) {
            if (read.equals(addresses.get(i))) {
            	System.out.println(addresses.get(++i));            	
            }
            }
        }
    }

