package com.javarush.test.level13.lesson02.task10;

/* CleverMan � SmartGirl
1. ������ ���������� Secretary � Boss � ������� CleverMan � SmartGirl. �� ������ �� ������. �������, ���� �����.
2. ���������  ���������� Secretary � Boss �� ����������� Person � Workable ���,
����� ��� ������ � ������� CleverMan � SmartGirl ��������� ������������ � �����-�� ����������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }

    interface Person
    {
        void use(Person person);
        void startToWork();
    }

    interface Workable
    {
        boolean wantGetExtraWork();
    }

    interface Secretary extends Person
    {
    }

    interface Boss extends Person, Workable
    {
    }

    class CleverMan implements Boss
    {
        public void use(Person person)
        {
            person.startToWork();
        }

        public void startToWork()
        {
        }

        public boolean wantGetExtraWork()
        {
            return true;
        }
    }

    class SmartGirl implements Secretary
    {
        public void use(Person person)
        {
        }

        public void startToWork()
        {
        }
    }
}