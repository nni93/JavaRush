package com.javarush.test.level09.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* ����� ��������� ���������, ����� ��������������� � ��������
������: ��������� ������ ��� ����� �����. � �������� ������ ���� �� ����� �������� ������ ������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);


        int data;
        int count = 0;
        while ( (data = fileInputStream.read()) != -1) {

            fileOutputStream.write(data);
            count++;
        }

        System.out.println("����������� ���� " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }
}