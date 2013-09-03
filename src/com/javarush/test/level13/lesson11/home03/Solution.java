package com.javarush.test.level13.lesson11.home03;

/* ������ �����
1. ������� � ������� ��� �����.
2. ������� � �������(�� �����) ���������� �����.
3. �� ������ ������� ���� � �����.

@author Nikolaieva Natalia
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream inputStream = new FileInputStream(fileName);
        OutputStream outputStream = new PrintStream(System.out);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }
        inputStream.close();
        outputStream.close();
    }
}