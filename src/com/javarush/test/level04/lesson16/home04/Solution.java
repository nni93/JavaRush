package com.javarush.test.level04.lesson16.home04;

/* ���� ����� '����'...
������ � ���������� ������ name.
������ � ���������� ���� �������� (��� �����): y, m, d.
������� �� ����� �����:
����� ����� name
� ������� d.m.y�
������:
���� ����� ����
� ������� 15.2.1988

@author Nikolaieva Natalia
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        String name;
        Integer y, m, d;

        Scanner in = new Scanner(System.in);

            name = in.nextLine();  
           
            y = in.nextInt();
            m  = in.nextInt();
            d  = in.nextInt(); 

            System.out.println("���� ����� " + name);
            System.out.println("� ������� " + d + "." + m + "." + y);
            in.close();
    }
}