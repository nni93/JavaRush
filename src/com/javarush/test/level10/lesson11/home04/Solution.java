package com.javarush.test.level10.lesson11.home04;


/* ������� ��������
������� �� ����� ������� �� �� ���� ������� Java, � ���� ������� �������� 40 ��� �� �������.
�������:
� �� ���� ������� Java, � ���� ������� ��������
�� ���� ������� Java, � ���� ������� ��������
�� ���� ������� Java, � ���� ������� ��������
� ���� ������� Java, � ���� ������� ��������
���� ������� Java, � ���� ������� ��������
���� ������� Java, � ���� ������� ��������
�

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "� �� ���� ������� Java, � ���� ������� ��������";

        for (int i = 0; i < 40; i++) {
        	String string = null;
        	for (int j = 0; j < s.length(); j++) {
        	    string = s.substring(i);
        	}
        	System.out.println(string);
        
         }
        }
    }
