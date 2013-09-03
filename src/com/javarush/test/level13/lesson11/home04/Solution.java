package com.javarush.test.level13.lesson11.home04;

/* ������ � ����
1. �������� � ������� ��� �����.
2. ��������� ������ � �������, ���� ������������ �� ������ ������ "exit".
3. ������� ��� ������ � ����.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        String line;
        do
        {
        line = reader.readLine();
        writer.write(line);
         
        if (!line.equals("exit"))
        {
        writer.newLine();
        }
        else break;
        }
        while (!line.equals("exit"));
        reader.close();
        writer.close();
      }
    }