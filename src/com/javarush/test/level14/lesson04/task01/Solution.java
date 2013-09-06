package com.javarush.test.level14.lesson04.task01;

/* Building � School
1. �������� ��������� ������������ ����� Building(������) � School(������ �����).
2. �������, ������ ������ ������ ������ ���������� ������ getSchool � getBuilding.
3. ������ null �� ������ ������ Building ��� School.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool()
    {
        return new School();
    }

    public static Building getBuilding()
    {
        return new Building();
    }

    static class School extends Building
    {
        @Override
        public String toString()
        {
            return "School";
        }
    }

    static class Building
    {
        @Override
        public String toString()
        {
            return "Building";
        }
    }
}