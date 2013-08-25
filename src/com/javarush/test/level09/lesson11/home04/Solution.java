package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* ��������� ���
������ � ���������� ���� � ������� �08/18/2013�
������� �� ����� ��� ���� � ���� �AUG 18, 2013�.
��������������� �������� Date � SimpleDateFormat.

@author Nikolaieva Natalia
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringDate = reader.readLine();
        Date date = new Date(stringDate);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(simpleDateFormat.format(date).toUpperCase());
    }
}