package com.javarush.test.level13.lesson11.bonus01;

/* ���������� ������ ����� �� �����
1. ������ ��� ����� � �������.
2. ��������� �� ���� ����� �����.
3. ������� �� ������� ������ ������, ��������������� �� �����������.
������ �����:
5
8
11
3
2
10
������ ������:
2
8
10

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        Scanner s = new Scanner(new File(line));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (s.hasNextInt()){
            list.add(s.nextInt());
        }
        s.close();
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)%2==0) {
                    System.out.println(list.get(i));
                }
            }
        }
    }