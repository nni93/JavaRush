package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* ��������� ��� ������ ����� � ����� ������
������ � ���������� 2 ����� N  � M.
������ N ����� � ��������� ��� ������.
����������� M ������ ����� � ����� ������.
������� ������ �� �����, ������ �������� � ����� ������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
           list.add(reader.readLine());

        }
        if (n >= m) {
        for (int i = 0; i < m; i++) {
        	list.add(list.size(), list.get(i));
          }
        } else if (n <= m) {
        	for (int i = 0; i < list.size(); i++) {
        		list.add(list.size(), list.get(i));
        	}
        }
        if (n >= m) {
        	for (int i = 0; i < m; i++) {
        		list.remove(0);
        	}
        } else  if (n <= m) {
        	for (int i = 0; i < list.size(); i++) {
        		list.remove(0);
        	}
        }
        for (int i = 0; i < list.size(); i++) {
        	System.out.println(list.get(i));
        }
    }
}