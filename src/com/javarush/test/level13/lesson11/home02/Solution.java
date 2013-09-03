package com.javarush.test.level13.lesson11.home02;

/* ������
1. � ������ Today ����������� ��������� Weather.
2. �������, ��� ������ �������� String type � ������� getWeatherType().
3. ���������� Weather � WeatherType ��� �����������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FROZEN));
    }

    static class Today implements Weather
    {
        private String type;

        Today(String type)
        {
            this.type = type;
        }

        @Override
        public String getWeatherType()
        {
            return type;
        }

        @Override
        public String toString()
        {
            return String.format("%s for today", this.getWeatherType());
        }
    }
}