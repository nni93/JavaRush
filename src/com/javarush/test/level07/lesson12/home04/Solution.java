package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* ������� � ���������� ������, ���� ������������ �� ����� ������ ������
������� ������ �����.
������ ������ � ���������� � �������� �� � ������.
������� � ���������� ������, ���� ������������ �� ����� ������ "end".  "end" �� ���������.
������� ������ �� �����, ������ � ����� ������.
*/

public class Solution
{
	
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        
        String keyWord = "end";
        for (String s = reader.readLine(); !s.contains(keyWord); s = reader.readLine()) {

        	list.add(s);
        }
        for (String s : list) {
            System.out.println(s);
            }
     }
    }
