package com.javarush.test.level11.lesson06.task05;

/* ��-��������
�������� ������ �������: Worker(���������), Clerk (�����), IT (��-����������), Programmer(�����������), ProjectManager(�������� �������), CTO(����������� ��������), HR(��������), OfficeManager(����-��������), Cleaner (�������).
������������ ������������, ��������� ������� � ������������ ��������� �� ��-�����������.
������������ ���������, �������� � ����-��������� �� ������.
������������ ������ � ��-����������� �� ����������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Worker
    {

    }

    public class Clerk extends Worker
    {

    }

    public class IT extends Worker
    {

    }

    public class Programmer extends IT
    {

    }

    public class ProjectManager extends IT
    {

    }

    public class CTO extends IT
    {

    }

    public class OfficeManager extends Clerk
    {

    }

    public class HR extends Clerk
    {

    }

    public class Cleaner extends Clerk
    {

    }
}