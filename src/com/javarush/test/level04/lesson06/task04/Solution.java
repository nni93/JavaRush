package com.javarush.test.level04.lesson06.task04;

/* �������� �����
������ � ���������� ��� �����, � ���� ����� ���������� ������� ��������� ������ ����������. ���� ����� ������, �� �� ����� ����� � ������� ��������� � ������ ���� ������.

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String name1, name2;
        
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        
        name1 = BR.readLine();
        name2 = BR.readLine();
        if (name1.equals(name2)) {
        System.out.println("����� ���������");
        } else if(name1.length() == name2.length()) {
        System.out.println("����� ���� �����");
          }
    }
}