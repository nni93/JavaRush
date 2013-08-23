package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* ������ � �����
1. ����������� ����� isDateOdd(String date) ���, ����� �� ��������� true, ���� ���������� ���� � ������ ���� - �������� �����, ����� false
2. String date ���������� � ������� MAY 1 2013

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
    	String date = "JAN 1 2013";
    	
    	System.out.println(isDateOdd(date));
    }

    public static boolean isDateOdd(String date)
    {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);
        yearStartTime.setMonth(1);

        Date currentTime = new Date(date);
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int)(msTimeDistance/msDay);

        if (dayCount%2 == 0) {
        return false;
        } else return true;
    }
}