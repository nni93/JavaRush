package com.javarush.test.level04.lesson16.home03;

import java.util.Scanner;

/* ��������� ����� �����
������� � ���������� ����� � ������� �� �����. ���� ������������ ���� -1, ������� �� ����� ����� � ��������� ���������.  -1 ������ ����������� � �����.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Integer i;
        int sum = 0;

        Scanner in = new Scanner(System.in);
        
        while(true) {
        	i = Integer.valueOf(in.nextInt());
        	sum += i;
        	if (i == -1) {
        		break;
        	}
        }
        System.out.println(sum);
   }
}